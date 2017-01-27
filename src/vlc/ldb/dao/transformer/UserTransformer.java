package vlc.ldb.dao.transformer;

import vlc.common.to.UserTO;
import vlc.ldb.model.User;

public class UserTransformer implements EntityTransformer<UserTO, User> {

    @Override
    public User toModel(UserTO entityTO) {
        return new User(entityTO.getId(), entityTO.getName(), entityTO.getSurname(), entityTO.getBirthday(), 
                entityTO.getTelegramId());
    }

    @Override
    public UserTO toTO(User entity) {
        return new UserTO(entity.getId(), entity.getName(), entity.getSurname(), entity.getBirthday(),
                entity.getTelegramId());
    }

    @Override
    public String getEntityClassName() {
        return User.class.getSimpleName();
    }

    @Override
    public void updateEntity(User user, UserTO userTO) {
        user.setName(userTO.getName());
        user.setSurname(userTO.getSurname());
        user.setBirthday(userTO.getBirthday());
        user.setTelegramId(userTO.getTelegramId());
    }
}
