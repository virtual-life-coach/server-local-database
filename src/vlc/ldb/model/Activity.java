package vlc.ldb.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Activity")
public class Activity implements Serializable {

    @Id
    @TableGenerator(name="ACTIVITY_ID_GENERATOR", table="ACTIVITY_SEQUENCES", pkColumnName="ACTIVITY_SEQ_NAME",
            valueColumnName="ACTIVITY_SEQ_NUMBER", pkColumnValue = "ACTIVITY_SEQUENCE", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="ACTIVITY_ID_GENERATOR")
    private Integer id;

    @Column(name="description")
    private String description;

    public Activity() {

    }

    public Activity(Integer id, String description) {
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
        return "Activity{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
