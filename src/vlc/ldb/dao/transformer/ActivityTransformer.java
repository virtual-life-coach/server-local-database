package vlc.ldb.dao.transformer;

import vlc.common.to.ActivityTO;
import vlc.ldb.dao.EntityDAO;
import vlc.ldb.model.Activity;

import javax.persistence.EntityManager;

public class ActivityTransformer implements EntityTransformer<ActivityTO, Activity> {

    @Override
    public Activity toModel(ActivityTO entityTO) {
        return new Activity(entityTO.getId(), entityTO.getDescription());
    }

    @Override
    public ActivityTO toTO(Activity entity) {
        return new ActivityTO(entity.getId(), entity.getDescription());
    }

    @Override
    public String getEntityClassName() {
        return Activity.class.getSimpleName();
    }

    @Override
    public void updateEntity(EntityManager entityManager, EntityDAO<ActivityTO, Activity> entityDAO, ActivityTO entityTO) {
        // TODO
    }
}
