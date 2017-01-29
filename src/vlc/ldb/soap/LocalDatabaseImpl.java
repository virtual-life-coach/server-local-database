package vlc.ldb.soap;

import vlc.common.to.*;
import vlc.ldb.dao.EntityDAO;
import vlc.ldb.dao.transformer.*;
import vlc.ldb.dao.updater.*;
import vlc.ldb.model.*;

import javax.jws.WebService;
import java.util.List;

/**
 * The API interface which SOAP will expose. Provides CRUD methods for every entity.
 */
@WebService(endpointInterface = "vlc.ldb.soap.LocalDatabase", serviceName="LocalDatabaseService")
public class LocalDatabaseImpl implements LocalDatabase {

    /* Activity CRUD */

    @Override
    public ActivityTO createActivity(ActivityTO activityTO) {
        EntityDAO<ActivityTO, Activity> activityDAO = new EntityDAO<>(new ActivityTransformer(), new ActivityUpdater());
        return activityDAO.createEntity(activityTO);
    }

    @Override
    public ActivityTO readActivity(Integer activityId) {
        EntityDAO<ActivityTO, Activity> activityDAO = new EntityDAO<>(new ActivityTransformer(), new ActivityUpdater());
        return activityDAO.readEntity(activityId);
    }

    @Override
    public void updateActivity(ActivityTO activityTO) {
        EntityDAO<ActivityTO, Activity> activityDAO = new EntityDAO<>(new ActivityTransformer(), new ActivityUpdater());
        activityDAO.updateEntity(activityTO);
    }

    @Override
    public void deleteActivity(Integer activityId) {
        EntityDAO<ActivityTO, Activity> activityDAO = new EntityDAO<>(new ActivityTransformer(), new ActivityUpdater());
        activityDAO.deleteEntity(activityId);
    }

    @Override
    public List<ActivityTO> listActivities() {
        EntityDAO<ActivityTO, Activity> activityDAO = new EntityDAO<>(new ActivityTransformer(), new ActivityUpdater());
        return activityDAO.listEntities();
    }

    
    /* Appointment CRUD */

    @Override
    public AppointmentTO createAppointment(AppointmentTO appointmentTO) {
        EntityDAO<AppointmentTO, Appointment> appointmentDAO = new EntityDAO<>(new AppointmentTransformer(),
                new AppointmentUpdater());
        return appointmentDAO.createEntity(appointmentTO);
    }

    @Override
    public AppointmentTO readAppointment(Integer appointmentId) {
        EntityDAO<AppointmentTO, Appointment> appointmentDAO = new EntityDAO<>(new AppointmentTransformer(),
                new AppointmentUpdater());
        return appointmentDAO.readEntity(appointmentId);
    }

    @Override
    public void updateAppointment(AppointmentTO appointmentTO) {
        EntityDAO<AppointmentTO, Appointment> appointmentDAO = new EntityDAO<>(new AppointmentTransformer(),
                new AppointmentUpdater());
        appointmentDAO.updateEntity(appointmentTO);
    }

    @Override
    public void deleteAppointment(Integer appointmentId) {
        EntityDAO<AppointmentTO, Appointment> appointmentDAO = new EntityDAO<>(new AppointmentTransformer(),
                new AppointmentUpdater());
        appointmentDAO.deleteEntity(appointmentId);
    }

    @Override
    public List<AppointmentTO> listAppointments() {
        EntityDAO<AppointmentTO, Appointment> appointmentDAO = new EntityDAO<>(new AppointmentTransformer(),
                new AppointmentUpdater());
        return appointmentDAO.listEntities();
    }

    
    /* Doctor CRUD */

    @Override
    public DoctorTO createDoctor(DoctorTO doctorTO) {
        EntityDAO<DoctorTO, Doctor> doctorDAO = new EntityDAO<>(new DoctorTransformer(), new DoctorUpdater());
        return doctorDAO.createEntity(doctorTO);
    }

    @Override
    public DoctorTO readDoctor(Integer doctorId) {
        EntityDAO<DoctorTO, Doctor> doctorDAO = new EntityDAO<>(new DoctorTransformer(), new DoctorUpdater());
        return doctorDAO.readEntity(doctorId);
    }

    @Override
    public void updateDoctor(DoctorTO doctorTO) {
        EntityDAO<DoctorTO, Doctor> doctorDAO = new EntityDAO<>(new DoctorTransformer(), new DoctorUpdater());
        doctorDAO.updateEntity(doctorTO);
    }

    @Override
    public void deleteDoctor(Integer doctorId) {
        EntityDAO<DoctorTO, Doctor> doctorDAO = new EntityDAO<>(new DoctorTransformer(), new DoctorUpdater());
        doctorDAO.deleteEntity(doctorId);
    }

    @Override
    public List<DoctorTO> listDoctors() {
        EntityDAO<DoctorTO, Doctor> doctorDAO = new EntityDAO<>(new DoctorTransformer(), new DoctorUpdater());
        return doctorDAO.listEntities();
    }

    
    /* Measurement CRUD */

    @Override
    public MeasurementTO createMeasurement(MeasurementTO measurementTO) {
        EntityDAO<MeasurementTO, Measurement> measurementDAO = new EntityDAO<>(new MeasurementTransformer(),
                new MeasurementUpdater());
        return measurementDAO.createEntity(measurementTO);
    }

    @Override
    public MeasurementTO readMeasurement(Integer measurementId) {
        EntityDAO<MeasurementTO, Measurement> measurementDAO = new EntityDAO<>(new MeasurementTransformer(),
                new MeasurementUpdater());
        return measurementDAO.readEntity(measurementId);
    }

    @Override
    public void updateMeasurement(MeasurementTO measurementTO) {
        EntityDAO<MeasurementTO, Measurement> measurementDAO = new EntityDAO<>(new MeasurementTransformer(),
                new MeasurementUpdater());
        measurementDAO.updateEntity(measurementTO);
    }

    @Override
    public void deleteMeasurement(Integer measurementId) {
        EntityDAO<MeasurementTO, Measurement> measurementDAO = new EntityDAO<>(new MeasurementTransformer(),
                new MeasurementUpdater());
        measurementDAO.deleteEntity(measurementId);
    }

    @Override
    public List<MeasurementTO> listMeasurements() {
        EntityDAO<MeasurementTO, Measurement> measurementDAO = new EntityDAO<>(new MeasurementTransformer(),
                new MeasurementUpdater());
        return measurementDAO.listEntities();
    }

    
    /* UserActivity CRUD */
    
    @Override
    public UserActivityTO createUserActivity(UserActivityTO userActivityTO) {
        EntityDAO<UserActivityTO, UserActivity> userActivityDAO = new EntityDAO<>(new UserActivityTransformer(),
                new UserActivityUpdater());
        return userActivityDAO.createEntity(userActivityTO);
    }

    @Override
    public UserActivityTO readUserActivity(Integer userActivityId) {
        EntityDAO<UserActivityTO, UserActivity> userActivityDAO = new EntityDAO<>(new UserActivityTransformer(),
                new UserActivityUpdater());
        return userActivityDAO.readEntity(userActivityId);
    }

    @Override
    public void updateUserActivity(UserActivityTO userActivityTO) {
        EntityDAO<UserActivityTO, UserActivity> userActivityDAO = new EntityDAO<>(new UserActivityTransformer(),
                new UserActivityUpdater());
        userActivityDAO.updateEntity(userActivityTO);
    }

    @Override
    public void deleteUserActivity(Integer userActivityId) {
        EntityDAO<UserActivityTO, UserActivity> userActivityDAO = new EntityDAO<>(new UserActivityTransformer(),
                new UserActivityUpdater());
        userActivityDAO.deleteEntity(userActivityId);
    }

    @Override
    public List<UserActivityTO> listUserActivities() {
        EntityDAO<UserActivityTO, UserActivity> userActivityDAO = new EntityDAO<>(new UserActivityTransformer(),
                new UserActivityUpdater());
        return userActivityDAO.listEntities();
    }

    @Override
    public void updateUserActivityValue(Integer activityId, Long value) {
        EntityDAO<UserActivityTO, UserActivity> userActivityDAO = new EntityDAO<>(new UserActivityTransformer(),
                new UserActivityProgressUpdater());
        UserActivityTO userActivityTO = new UserActivityTO();
        userActivityTO.setId(activityId);
        userActivityTO.setCurrentValue(value);
        userActivityDAO.updateEntity(userActivityTO);
    }


    /* User CRUD */

    @Override
    public UserTO createUser(UserTO userTO) {
        EntityDAO<UserTO, User> userDAO = new EntityDAO<>(new UserTransformer(), new UserUpdater());
        return userDAO.createEntity(userTO);
    }

    @Override
    public UserTO readUser(Integer userId) {
        EntityDAO<UserTO, User> userDAO = new EntityDAO<>(new UserTransformer(), new UserUpdater());
        return userDAO.readEntity(userId);
    }

    @Override
    public void updateUser(UserTO userTO) {
        EntityDAO<UserTO, User> userDAO = new EntityDAO<>(new UserTransformer(), new UserUpdater());
        userDAO.updateEntity(userTO);
    }

    @Override
    public void deleteUser(Integer userId) {
        EntityDAO<UserTO, User> userDAO = new EntityDAO<>(new UserTransformer(), new UserUpdater());
        userDAO.deleteEntity(userId);
    }

    @Override
    public List<UserTO> listUsers() {
        EntityDAO<UserTO, User> userDAO = new EntityDAO<>(new UserTransformer(), new UserUpdater());
        return userDAO.listEntities();
    }

    @Override
    public UserTO getUserByTelegramId(Integer telegramId) {
        EntityDAO<UserTO, User> userDAO = new EntityDAO<>(new UserTransformer(), new UserUpdater());
        return userDAO.findByKey("telegramId", telegramId.toString());
    }

    
    /* Utility */

    @Override
    public void resetDB() {
        EntityDAO.initDatabase();
    }
}
