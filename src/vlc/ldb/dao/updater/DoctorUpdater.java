package vlc.ldb.dao.updater;

import vlc.common.to.DoctorTO;
import vlc.ldb.model.Doctor;

public class DoctorUpdater implements EntityUpdater<DoctorTO, Doctor> {

    @Override
    public void updateEntity(Doctor doctor, DoctorTO doctorTO) {
        doctor.setName(doctorTO.getName());
        doctor.setSurname(doctorTO.getSurname());
        doctor.setBirthday(doctorTO.getBirthday());
        doctor.setTelegramId(doctorTO.getTelegramId());
    }
}
