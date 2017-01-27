package vlc.ldb.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Appointment")
public class Appointment implements Serializable {

    @Id
    @TableGenerator(name="APPOINTMENT_ID_GENERATOR", table="APPOINTMENT_SEQUENCES", pkColumnName="APPOINTMENT_SEQ_NAME",
            valueColumnName="APPOINTMENT_SEQ_NUMBER", pkColumnValue = "APPOINTMENT_SEQUENCE", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="APPOINTMENT_ID_GENERATOR")
    private Integer id;

    @Column(name="userid")
    private String userId;

    @Column(name="doctorid")
    private String doctorId;

    @Column(name="date")
    private String date;

    @Column(name="location")
    private String location;

    public Appointment() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", date='" + date + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
