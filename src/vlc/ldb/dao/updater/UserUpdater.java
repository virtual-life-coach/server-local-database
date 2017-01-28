package vlc.ldb.dao.updater;

import vlc.common.to.UserTO;
import vlc.ldb.model.User;

public class UserUpdater implements EntityUpdater<UserTO, User> {

    @Override
    public void updateEntity(User user, UserTO userTO) {
        user.setName(userTO.getName());
        user.setSurname(userTO.getSurname());
        user.setBirthday(userTO.getBirthday());
        user.setTelegramId(userTO.getTelegramId());
    }
}
