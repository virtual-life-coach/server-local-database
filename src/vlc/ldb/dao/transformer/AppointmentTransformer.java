package vlc.ldb.dao.transformer;

import vlc.common.to.AppointmentTO;
import vlc.ldb.model.Appointment;

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
    public void updateEntity(Appointment appointment, AppointmentTO appointmentTO) {
        appointment.setUserId(appointmentTO.getUserId());
        appointment.setDoctorId(appointmentTO.getDoctorId());
        appointment.setDate(appointmentTO.getDate());
        appointment.setLocation(appointmentTO.getLocation());
    }
}
