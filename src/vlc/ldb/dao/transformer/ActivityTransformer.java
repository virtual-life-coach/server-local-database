package vlc.ldb.dao.transformer;

import vlc.common.to.ActivityTO;
import vlc.ldb.model.Activity;

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
    public String getModelClassName() {
        return Activity.class.getSimpleName();
    }
}
