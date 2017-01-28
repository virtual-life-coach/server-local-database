package vlc.ldb.dao.updater;

public interface EntityUpdater<T, V> {

    void updateEntity(V entity, T entityTO);
}
