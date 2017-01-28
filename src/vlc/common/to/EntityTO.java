package vlc.common.to;

import java.io.Serializable;

@Deprecated
public class EntityTO implements Serializable {

    private Integer id;
    private String attribute;

    public EntityTO() {
    }

    public EntityTO(Integer id, String attribute) {
        this.id = id;
        this.attribute = attribute;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return "EntityTO{" +
                "id=" + id +
                ", attribute='" + attribute + '\'' +
                '}';
    }
}
