package type;

import java.util.Date;

public class User {
    private String username;
    private String passwoed;
    private int age;
    private Date birth;

    public User() {
    }

    public User(String username, String passwoed, int age, Date birth) {
        this.username = username;
        this.passwoed = passwoed;
        this.age = age;
        this.birth = birth;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswoed() {
        return passwoed;
    }

    public void setPasswoed(String passwoed) {
        this.passwoed = passwoed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
