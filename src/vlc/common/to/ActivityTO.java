package vlc.common.to;

import vlc.common.util.Identifiable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ActivityTO implements Serializable, Identifiable {

    private static final long serialVersionUID = 42L;

    private Integer id;
    private String description;

    public ActivityTO() {

    }

    public ActivityTO(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ActivityTO{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
