package ru.kpfu.itis.ra.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by rubenahmadiev on 26.05.16.
 */
@Entity
public class Client {
    private Integer id;
    private String nameoforganization;
    private String fieldofactivity;
    private String mailoforganization;
    private String ceo;
    private Integer inn;
    private List<ClientsOrder> orders;
    private MyUser user;
    private Integer userid;

    @OneToOne
    @JoinColumn(name="id", referencedColumnName = "client_id")
    public MyUser getUser() {
        return user;
    }

    public void setUser(MyUser user) {
        this.user = user;
    }


    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "client_id")
    public List<ClientsOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ClientsOrder> orders) {
        this.orders = orders;
    }

    @Basic
    @Column(name = "userid")
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_id_seq")
    @SequenceGenerator(name = "client_id_seq", sequenceName = "client_id_sequence", allocationSize = 1)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nameoforganization")
    public String getNameoforganization() {
        return nameoforganization;
    }

    public void setNameoforganization(String nameoforganization) {
        this.nameoforganization = nameoforganization;
    }

    @Basic
    @Column(name = "fieldofactivity")
    public String getFieldofactivity() {
        return fieldofactivity;
    }

    public void setFieldofactivity(String fieldofactivity) {
        this.fieldofactivity = fieldofactivity;
    }

    @Basic
    @Column(name = "mailoforganization")
    public String getMailoforganization() {
        return mailoforganization;
    }

    public void setMailoforganization(String mailoforganization) {
        this.mailoforganization = mailoforganization;
    }

    @Basic
    @Column(name = "ceo")
    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    @Basic
    @Column(name = "inn")
    public Integer getInn() {
        return inn;
    }

    public void setInn(Integer inn) {
        this.inn = inn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (id != null ? !id.equals(client.id) : client.id != null) return false;
        if (nameoforganization != null ? !nameoforganization.equals(client.nameoforganization) : client.nameoforganization != null)
            return false;
        if (fieldofactivity != null ? !fieldofactivity.equals(client.fieldofactivity) : client.fieldofactivity != null)
            return false;
        if (mailoforganization != null ? !mailoforganization.equals(client.mailoforganization) : client.mailoforganization != null)
            return false;
        if (ceo != null ? !ceo.equals(client.ceo) : client.ceo != null) return false;
        if (inn != null ? !inn.equals(client.inn) : client.inn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nameoforganization != null ? nameoforganization.hashCode() : 0);
        result = 31 * result + (fieldofactivity != null ? fieldofactivity.hashCode() : 0);
        result = 31 * result + (mailoforganization != null ? mailoforganization.hashCode() : 0);
        result = 31 * result + (ceo != null ? ceo.hashCode() : 0);
        result = 31 * result + (inn != null ? inn.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nameoforganization='" + nameoforganization + '\'' +
                ", fieldofactivity='" + fieldofactivity + '\'' +
                ", mailoforganization='" + mailoforganization + '\'' +
                ", ceo='" + ceo + '\'' +
                ", inn=" + inn +
                '}';
    }
}
