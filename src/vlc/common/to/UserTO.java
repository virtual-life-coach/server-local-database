package vlc.common.to;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class UserTO implements Serializable{

    private static final long serialVersionUID = 42L;

    private Integer id;
    private String name;
    private String surname;
    private String birthday;
    private String telegramId;

    public UserTO() {

    }

    public UserTO(Integer id, String name, String surname, String birthday, String telegramId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.telegramId = telegramId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getTelegramId() {
        return telegramId;
    }

    public void setTelegramId(String telegramId) {
        this.telegramId = telegramId;
    }

    @Override
    public String toString() {
        return "UserTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", telegramId='" + telegramId + '\'' +
                '}';
    }
}
