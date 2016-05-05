package ru.kpfu.itis.ra.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by rubenahmadiev on 24.04.16.
 */
@Entity
public class Clients {
    private Integer id;
    private String nameOfOrganization;
    private Integer inn;
    private Integer kpp;
    private String fieldOfActivity;
    private String ceo;
    private String mailOfOrganization;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name_of_organization")
    public String getNameOfOrganization() {
        return nameOfOrganization;
    }

    public void setNameOfOrganization(String nameOfOrganization) {
        this.nameOfOrganization = nameOfOrganization;
    }

    @Basic
    @Column(name = "INN")
    public Integer getInn() {
        return inn;
    }

    public void setInn(Integer inn) {
        this.inn = inn;
    }

    @Basic
    @Column(name = "KPP")
    public Integer getKpp() {
        return kpp;
    }

    public void setKpp(Integer kpp) {
        this.kpp = kpp;
    }

    @Basic
    @Column(name = "field_of_activity")
    public String getFieldOfActivity() {
        return fieldOfActivity;
    }

    public void setFieldOfActivity(String fieldOfActivity) {
        this.fieldOfActivity = fieldOfActivity;
    }

    @Basic
    @Column(name = "CEO")
    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    @Basic
    @Column(name = "mail_of_organization")
    public String getMailOfOrganization() {
        return mailOfOrganization;
    }

    public void setMailOfOrganization(String mailOfOrganization) {
        this.mailOfOrganization = mailOfOrganization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clients clients = (Clients) o;

        if (id != null ? !id.equals(clients.id) : clients.id != null) return false;
        if (nameOfOrganization != null ? !nameOfOrganization.equals(clients.nameOfOrganization) : clients.nameOfOrganization != null)
            return false;
        if (inn != null ? !inn.equals(clients.inn) : clients.inn != null) return false;
        if (kpp != null ? !kpp.equals(clients.kpp) : clients.kpp != null) return false;
        if (fieldOfActivity != null ? !fieldOfActivity.equals(clients.fieldOfActivity) : clients.fieldOfActivity != null)
            return false;
        if (ceo != null ? !ceo.equals(clients.ceo) : clients.ceo != null) return false;
        if (mailOfOrganization != null ? !mailOfOrganization.equals(clients.mailOfOrganization) : clients.mailOfOrganization != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nameOfOrganization != null ? nameOfOrganization.hashCode() : 0);
        result = 31 * result + (inn != null ? inn.hashCode() : 0);
        result = 31 * result + (kpp != null ? kpp.hashCode() : 0);
        result = 31 * result + (fieldOfActivity != null ? fieldOfActivity.hashCode() : 0);
        result = 31 * result + (ceo != null ? ceo.hashCode() : 0);
        result = 31 * result + (mailOfOrganization != null ? mailOfOrganization.hashCode() : 0);
        return result;
    }
}
