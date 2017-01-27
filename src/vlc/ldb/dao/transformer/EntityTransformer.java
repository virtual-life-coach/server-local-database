package vlc.ldb.dao.transformer;

import vlc.ldb.dao.EntityDAO;

import javax.persistence.EntityManager;

public interface EntityTransformer<T, V> {

    V toModel(T entityTO);
    T toTO(V entity);
    String getEntityClassName();
    void updateEntity(EntityManager entityManager, EntityDAO<T, V> entityDAO, T entityTO);

}
