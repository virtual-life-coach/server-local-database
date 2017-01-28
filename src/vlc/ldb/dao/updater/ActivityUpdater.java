package vlc.ldb.dao.updater;

import vlc.common.to.ActivityTO;
import vlc.ldb.model.Activity;

public class ActivityUpdater implements EntityUpdater<ActivityTO, Activity> {

    @Override
    public void updateEntity(Activity activity, ActivityTO activityTO) {
        activity.setDescription(activityTO.getDescription());
    }
}
