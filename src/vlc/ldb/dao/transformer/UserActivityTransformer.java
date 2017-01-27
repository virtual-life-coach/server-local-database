package vlc.ldb.dao.transformer;

import vlc.common.to.UserActivityTO;
import vlc.ldb.model.UserActivity;

public class UserActivityTransformer implements EntityTransformer<UserActivityTO, UserActivity> {

    @Override
    public UserActivity toModel(UserActivityTO entityTO) {
        return new UserActivity(entityTO.getId(), entityTO.getActivityId(), entityTO.getUserId(), entityTO.getDetails(), 
                entityTO.getTargetValue(), entityTO.getCurrentValue(), entityTO.getDeadlineDate(), entityTO.getCompleted());
    }

    @Override
    public UserActivityTO toTO(UserActivity entity) {
        return new UserActivityTO(entity.getId(), entity.getActivityId(), entity.getUserId(), entity.getDetails(),
                entity.getTargetValue(), entity.getCurrentValue(), entity.getDeadlineDate(), entity.getCompleted());
    }

    @Override
    public String getModelClassName() {
        return UserActivity.class.getSimpleName();
    }
}
