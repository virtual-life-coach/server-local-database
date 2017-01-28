package vlc.ldb.dao.updater;

import vlc.common.to.UserActivityTO;
import vlc.ldb.model.UserActivity;

public class UserActivityUpdater implements EntityUpdater<UserActivityTO, UserActivity> {

   @Override
    public void updateEntity(UserActivity userActivity, UserActivityTO userActivityTO) {
        userActivity.setActivityId(userActivityTO.getActivityId());
        userActivity.setUserId(userActivityTO.getUserId());
        userActivity.setDetails(userActivityTO.getDetails());
        userActivity.setTargetValue(userActivityTO.getTargetValue());
        userActivity.setCurrentValue(userActivityTO.getCurrentValue());
        userActivity.setDeadlineDate(userActivityTO.getDeadlineDate());
        userActivity.setCompleted(userActivityTO.getCompleted());
    }
}
