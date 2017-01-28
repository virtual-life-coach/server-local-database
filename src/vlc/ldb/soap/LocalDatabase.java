package vlc.ldb.soap;

import vlc.common.to.*;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use= SOAPBinding.Use.LITERAL) // optional
public interface LocalDatabase {

    /* Activity CRUD */
    
    @WebMethod
    ActivityTO createActivity(ActivityTO activityTO);

    @WebMethod
    ActivityTO readActivity(Integer activityId);

    @WebMethod
    void updateActivity(ActivityTO activityTO);

    @WebMethod
    void deleteActivity(Integer activityId);
    
    @WebMethod
    List<ActivityTO> listActivities();


    /* Appointment CRUD */

    @WebMethod
    AppointmentTO createAppointment(AppointmentTO appointmentTO);

    @WebMethod
    AppointmentTO readAppointment(Integer appointmentId);

    @WebMethod
    void updateAppointment(AppointmentTO appointmentTO);

    @WebMethod
    void deleteAppointment(Integer appointmentId);

    @WebMethod
    List<AppointmentTO> listAppointments();


    /* Doctor CRUD */

    @WebMethod
    DoctorTO createDoctor(DoctorTO doctorTO);

    @WebMethod
    DoctorTO readDoctor(Integer doctorId);

    @WebMethod
    void updateDoctor(DoctorTO doctorTO);

    @WebMethod
    void deleteDoctor(Integer doctorId);

    @WebMethod
    List<DoctorTO> listDoctors();


    /* Measurement CRUD */

    @WebMethod
    MeasurementTO createMeasurement(MeasurementTO measurementTO);

    @WebMethod
    MeasurementTO readMeasurement(Integer measurementId);

    @WebMethod
    void updateMeasurement(MeasurementTO measurementTO);

    @WebMethod
    void deleteMeasurement(Integer measurementId);

    @WebMethod
    List<MeasurementTO> listMeasurements();


    /* UserActivity CRUD */

    @WebMethod
    UserActivityTO createUserActivity(UserActivityTO userActivityTO);

    @WebMethod
    UserActivityTO readUserActivity(Integer userActivityId);

    @WebMethod
    void updateUserActivity(UserActivityTO userActivityTO);

    @WebMethod
    void deleteUserActivity(Integer userActivityId);

    @WebMethod
    List<UserActivityTO> listUserActivities();

    @WebMethod
    void updateUserActivity(Integer activityId, Long value);


    /* User CRUD */

    @WebMethod
    UserTO createUser(UserTO userTO);

    @WebMethod
    UserTO readUser(Integer userId);

    @WebMethod
    void updateUser(UserTO userTO);

    @WebMethod
    void deleteUser(Integer userId);

    @WebMethod
    List<UserTO> listUsers();

    @WebMethod
    UserTO getUserByTelegramId(Integer telegramId);


    /* Utility */
    
    @WebMethod
    void resetDB();
}