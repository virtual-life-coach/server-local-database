package vlc.ldb.dao.updater;

import vlc.common.to.AppointmentTO;
import vlc.ldb.model.Appointment;

public class AppointmentUpdater implements EntityUpdater<AppointmentTO, Appointment> {

    @Override
    public void updateEntity(Appointment appointment, AppointmentTO appointmentTO) {
        appointment.setUserId(appointmentTO.getUserId());
        appointment.setDoctorId(appointmentTO.getDoctorId());
        appointment.setDate(appointmentTO.getDate());
        appointment.setLocation(appointmentTO.getLocation());
    }
}
