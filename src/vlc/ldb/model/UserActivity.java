package vlc.ldb.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="UserActivity")
public class UserActivity implements Serializable {

    @Id
    @TableGenerator(name="USER_ACTIVITY_ID_GENERATOR", table="USER_ACTIVITY_SEQUENCES", pkColumnName="USER_ACTIVITY_SEQ_NAME",
            valueColumnName="USER_ACTIVITY_SEQ_NUMBER", pkColumnValue = "USER_ACTIVITY_SEQUENCE", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="USER_ACTIVITY_ID_GENERATOR")
    private Integer id;

    @Column(name="activityid")
    private Integer activityId;

    @Column(name="userid")
    private Integer userId;

    @Column(name="details")
    private String details;

    @Column(name="targetvalue")
    private Long targetValue;

    @Column(name="currentvalue")
    private Long currentValue;

    @Column(name="deadlinedate")
    private String deadlineDate;

    @Column(name="completed")
    private Boolean completed;

    public UserActivity() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Long getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(Long targetValue) {
        this.targetValue = targetValue;
    }

    public Long getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Long currentValue) {
        this.currentValue = currentValue;
    }

    public String getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(String deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "UserActivity{" +
                "id=" + id +
                ", activityId=" + activityId +
                ", userId=" + userId +
                ", details='" + details + '\'' +
                ", targetValue=" + targetValue +
                ", currentValue=" + currentValue +
                ", deadlineDate='" + deadlineDate + '\'' +
                ", completed=" + completed +
                '}';
    }
}
