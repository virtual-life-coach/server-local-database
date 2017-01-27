package vlc.common.to;

import vlc.common.util.Identifiable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class UserActivityTO implements Serializable, Identifiable {

    private static final long serialVersionUID = 42L;

    private Integer id;
    private Integer activityId;
    private Integer userId;
    private String details;
    private Long targetValue;
    private Long currentValue;
    private String deadlineDate;
    private Boolean completed;

    public UserActivityTO() {

    }

    public UserActivityTO(Integer id, Integer activityId, Integer userId, String details, Long targetValue,
                          Long currentValue, String deadlineDate, Boolean completed) {
        this.id = id;
        this.activityId = activityId;
        this.userId = userId;
        this.details = details;
        this.targetValue = targetValue;
        this.currentValue = currentValue;
        this.deadlineDate = deadlineDate;
        this.completed = completed;
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
        return "UserActivityTO{" +
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
