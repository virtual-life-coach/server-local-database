package vlc.ldb.dao;

import vlc.common.util.Identifiable;
import vlc.ldb.dao.transformer.EntityTransformer;
import vlc.ldb.dao.updater.EntityUpdater;
import vlc.ldb.persistence.PersistenceManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntityDAO<T extends Identifiable, V> {

    private EntityTransformer<T, V> transformer;
    private EntityUpdater<T, V> updater;

    public EntityDAO(EntityTransformer<T, V> transformer, EntityUpdater<T, V> updater) {
        this.transformer = transformer;
        this.updater = updater;
    }

    public T createEntity(T entityTO) {
        V entity = transformer.toModel(entityTO);
        PersistenceManager.instance.persist(entity);
        return transformer.toTO(entity);
    }

    public T readEntity(Integer entityId) {
        return findByKey("id", entityId);
    }

    public void updateEntity(T entityTO) {
        EntityManager entityManager = PersistenceManager.instance.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        String query = "SELECT e FROM " + transformer.getEntityClassName() + " e WHERE e.id=:arg1";
        Map<String, Object> params = new HashMap<>();
        params.put("arg1", entityTO.getId());
        V entity = (V) PersistenceManager.instance.singleResultQuery(entityManager, query, params);
        updater.updateEntity(entity, entityTO);
        entity = entityManager.merge(entity);
        entityManager.persist(entity);
        transaction.commit();
    }

    public void deleteEntity(Integer entityId) {
        String query = "DELETE FROM " + transformer.getEntityClassName() + " e WHERE e.id=:arg1";
        Map<String, Object> params = new HashMap<>();
        params.put("arg1", entityId);
        PersistenceManager.instance.updateQuery(query, params);
    }

    public List<T> listEntities() {
        String query = "SELECT e FROM " + transformer.getEntityClassName() + " e";
        List<V> entities = PersistenceManager.instance.listResultQuery(query);
        List<T> entitiesTOs = new ArrayList<>();
        for (V entity : entities) {
            entitiesTOs.add(transformer.toTO(entity));
        }
        return entitiesTOs;
    }

    public T findByKey(String fieldName, Integer key) {
        String query = "SELECT e FROM " + transformer.getEntityClassName() + " e WHERE e." + fieldName + "=:arg1";
        Map<String, Object> params = new HashMap<>();
        params.put("arg1", key.toString());
        V entity = (V) PersistenceManager.instance.singleResultQuery(query, params);
        return transformer.toTO(entity);
    }

    public static void initDatabase() {
        PersistenceManager.instance.updateQuery("DELETE FROM Activity a");
        PersistenceManager.instance.updateQuery("DELETE FROM Appointment a");
        PersistenceManager.instance.updateQuery("DELETE FROM Doctor d");
        PersistenceManager.instance.updateQuery("DELETE FROM Measurement m");
        PersistenceManager.instance.updateQuery("DELETE FROM User u");
        PersistenceManager.instance.updateQuery("DELETE FROM UserActivity u");
    }
}
