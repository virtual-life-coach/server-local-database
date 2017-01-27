package vlc.ldb.dao.transformer;

public interface EntityTransformer<T, V> {

    V toModel(T entityTO);
    T toTO(V entity);
    String getEntityClassName();
    void updateEntity(V entity, T entityTO);
}
