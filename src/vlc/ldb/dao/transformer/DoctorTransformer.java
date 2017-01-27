package vlc.ldb.dao.transformer;

import vlc.common.to.DoctorTO;
import vlc.ldb.model.Doctor;

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
    public String getModelClassName() {
        return Doctor.class.getSimpleName();
    }
}
