package kg.Library.FirstSpringLesson.model.user;

import java.util.Date;

public class User {
    private long id;
    private String name;
    private String surname;
    private String middleName;
    private Date date_of_birth;

    public User() {
    }

    public User(String name, String surname, String middleName, Date date_of_birth) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.date_of_birth = date_of_birth;
    }

    public long getId() {
        return id;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
}
