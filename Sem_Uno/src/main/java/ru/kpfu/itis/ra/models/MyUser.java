package ru.kpfu.itis.ra.models;

import javax.persistence.*;

/**
 * Created by rubenahmadiev on 04.05.16.
 */
@Entity
public class MyUser {
    private String login;
    private String password;
    private String role;
    private Integer id;

    @Basic
    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq")
    @SequenceGenerator(name = "user_id_seq", sequenceName = "users_id_sequence", allocationSize = 1)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyUser myUser = (MyUser) o;

        if (login != null ? !login.equals(myUser.login) : myUser.login != null) return false;
        if (password != null ? !password.equals(myUser.password) : myUser.password != null) return false;
        if (role != null ? !role.equals(myUser.role) : myUser.role != null) return false;
        if (id != null ? !id.equals(myUser.id) : myUser.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}
