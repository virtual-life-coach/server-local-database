package vlc.ldb.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="User")
public class User implements Serializable{

    @Id
    @TableGenerator(name="USER_ID_GENERATOR", table="USER_SEQUENCES", pkColumnName="USER_SEQ_NAME",
            valueColumnName="USER_SEQ_NUMBER", pkColumnValue = "USER_SEQUENCE", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="USER_ID_GENERATOR")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="birthday")
    private String birthday;

    @Column(name="telegramid")
    private String telegramId;

    public User() {

    }

    public User(Integer id, String name, String surname, String birthday, String telegramId) {
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
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", telegramId='" + telegramId + '\'' +
                '}';
    }
}
