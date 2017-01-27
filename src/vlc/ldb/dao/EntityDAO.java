package vlc.ldb.dao;

import vlc.ldb.dao.transformer.EntityTransformer;
import vlc.ldb.persistence.PersistenceManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntityDAO<T, V> {

    private EntityTransformer<T, V> transformer;

    public EntityDAO(EntityTransformer<T, V> transformer) {
        this.transformer = transformer;
    }

    public T createEntity(T entityTO) {
        V entity = transformer.toModel(entityTO);
        PersistenceManager.instance.persist(entity);
        return transformer.toTO(entity);
    }

    public T readEntity(Integer entityId) {
        String query = "SELECT e FROM " + transformer.getEntityClassName() + " e WHERE e.id=:arg1";
        Map<String, Object> params = new HashMap<>();
        params.put("arg1", entityId);
        V entity = (V) PersistenceManager.instance.singleResultQuery(query, params);
        return transformer.toTO(entity);
    }

    public void updateEntity(T entityTO) {
        EntityManager entityManager = PersistenceManager.instance.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        transformer.updateEntity(entityManager, this, entityTO);
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

    public static void initDatabase() {
        PersistenceManager.instance.updateQuery("DELETE FROM Activity a");
        PersistenceManager.instance.updateQuery("DELETE FROM Appointment a");
        PersistenceManager.instance.updateQuery("DELETE FROM Doctor d");
        PersistenceManager.instance.updateQuery("DELETE FROM Measurement m");
        PersistenceManager.instance.updateQuery("DELETE FROM User u");
        PersistenceManager.instance.updateQuery("DELETE FROM UserActivity u");
    }
}
