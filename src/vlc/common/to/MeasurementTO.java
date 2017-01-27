package vlc.common.to;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MeasurementTO implements Serializable {

    private static final long serialVersionUID = 42L;

    private Integer id;
    private Integer userId;
    private String type;
    private String date;
    private Double value;

    public MeasurementTO() {

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
        return "MeasurementTO{" +
                "id=" + id +
                ", userId=" + userId +
                ", type='" + type + '\'' +
                ", date='" + date + '\'' +
                ", value=" + value +
                '}';
    }
}
