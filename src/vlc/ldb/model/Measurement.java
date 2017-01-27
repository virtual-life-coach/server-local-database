package vlc.ldb.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Measurement")
public class Measurement implements Serializable {

    @Id
    @TableGenerator(name="MEASUREMENT_ID_GENERATOR", table="MEASUREMENT_SEQUENCES", pkColumnName="MEASUREMENT_SEQ_NAME",
            valueColumnName="MEASUREMENT_SEQ_NUMBER", pkColumnValue = "MEASUREMENT_SEQUENCE", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="MEASUREMENT_ID_GENERATOR")
    private Integer id;

    @Column(name="userId")
    private Integer userId;

    @Column(name="type")
    private String type;

    @Column(name="date")
    private String date;

    @Column(name="value")
    private Double value;

    public Measurement() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Measurement{" +
                "id=" + id +
                ", userId=" + userId +
                ", type='" + type + '\'' +
                ", date='" + date + '\'' +
                ", value=" + value +
                '}';
    }
}
