package vlc.ldb.dao.transformer;

import vlc.common.to.DoctorTO;
import vlc.ldb.dao.EntityDAO;
import vlc.ldb.model.Doctor;

import javax.persistence.EntityManager;

public class DoctorTransformer implements EntityTransformer<DoctorTO, Doctor> {

    @Override
    public Doctor toModel(DoctorTO entityTO) {
        return new Doctor(entityTO.getId(), entityTO.getName(), entityTO.getSurname(), entityTO.getBirthday(), 
                entityTO.getTelegramId());
    }

    @Override
    public DoctorTO toTO(Doctor entity) {
        return new DoctorTO(entity.getId(), entity.getName(), entity.getSurname(), entity.getBirthday(),
                entity.getTelegramId());
    }

    @Override
    public String getEntityClassName() {
        return Doctor.class.getSimpleName();
    }

    @Override
    public void updateEntity(EntityManager entityManager, EntityDAO<DoctorTO, Doctor> entityDAO, DoctorTO entityTO) {
        // TODO
    }
}
