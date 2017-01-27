package vlc.ldb.dao.transformer;

import vlc.common.to.UserTO;
import vlc.ldb.dao.EntityDAO;
import vlc.ldb.model.User;
import vlc.ldb.persistence.PersistenceManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.HashMap;
import java.util.Map;

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
        String query = "SELECT u FROM User u WHERE u.id=:arg1";
        Map<String, Object> params = new HashMap<>();
        params.put("arg1", userTO.getId());
        User user = (User) PersistenceManager.instance.singleResultQuery(entityManager, query, params);
        user.setName(userTO.getName());
        user.setSurname(userTO.getSurname());
        user.setBirthday(userTO.getBirthday());
        user.setTelegramId(userTO.getTelegramId());
        user = entityManager.merge(user);
        entityManager.persist(user);
    }
}
