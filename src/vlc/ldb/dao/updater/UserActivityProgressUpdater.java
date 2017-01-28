package vlc.ldb.dao.updater;

import vlc.common.to.UserActivityTO;
import vlc.ldb.model.UserActivity;

import java.util.Objects;

public class UserActivityProgressUpdater implements EntityUpdater<UserActivityTO, UserActivity> {

    @Override
    public void updateEntity(UserActivity userActivity, UserActivityTO userActivityTO) {
        userActivity.setCurrentValue(userActivityTO.getCurrentValue());
        if (Objects.equals(userActivity.getTargetValue(), userActivityTO.getCurrentValue())) {
            userActivity.setCompleted(true);
        }
    }
}
