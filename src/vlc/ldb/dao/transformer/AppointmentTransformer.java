package vlc.ldb.dao.transformer;

import vlc.common.to.AppointmentTO;
import vlc.ldb.dao.EntityDAO;
import vlc.ldb.model.Appointment;

import javax.persistence.EntityManager;

public class AppointmentTransformer implements EntityTransformer<AppointmentTO, Appointment> {

    @Override
    public Appointment toModel(AppointmentTO entityTO) {
        return new Appointment(entityTO.getId(), entityTO.getUserId(), entityTO.getDoctorId(), entityTO.getDate(), 
                entityTO.getLocation());
    }

    @Override
    public AppointmentTO toTO(Appointment entity) {
        return new AppointmentTO(entity.getId(), entity.getUserId(), entity.getDoctorId(), entity.getDate(),
                entity.getLocation());
    }

    @Override
    public String getEntityClassName() {
        return Appointment.class.getSimpleName();
    }

    @Override
    public void updateEntity(EntityManager entityManager, EntityDAO<AppointmentTO, Appointment> entityDAO, AppointmentTO entityTO) {
        // TODO
    }
}
