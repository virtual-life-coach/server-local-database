package vlc.ldb.dao.transformer;

import vlc.common.to.UserTO;
import vlc.ldb.dao.EntityDAO;
import vlc.ldb.model.User;

import javax.persistence.EntityManager;

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
    public void updateEntity(EntityManager entityManager, EntityDAO<UserTO, User> entityDAO, UserTO userTO) {
        UserTO oldUserTO = entityDAO.readEntity(userTO.getId());
        User user = toModel(oldUserTO);
        user = entityManager.merge(user);
        user.setName(userTO.getName());
        user.setSurname(userTO.getSurname());
        user.setBirthday(userTO.getBirthday());
        user.setTelegramId(userTO.getTelegramId());
        entityManager.persist(user);
    }
}
