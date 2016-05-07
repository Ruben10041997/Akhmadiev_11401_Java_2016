package ru.kpfu.itis.ra.models;

import javax.persistence.*;

/**
 * Created by rubenahmadiev on 24.04.16.
 */
@Entity
public class Client {
    private Integer id;
    private String nameOfOrganization;
    private Integer inn;
    private Integer kpp;
    private String fieldOfActivity;
    private String ceo;
    private String mailOfOrganization;

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

        Client client = (Client) o;

        if (id != null ? !id.equals(client.id) : client.id != null) return false;
        if (nameOfOrganization != null ? !nameOfOrganization.equals(client.nameOfOrganization) : client.nameOfOrganization != null)
            return false;
        if (inn != null ? !inn.equals(client.inn) : client.inn != null) return false;
        if (kpp != null ? !kpp.equals(client.kpp) : client.kpp != null) return false;
        if (fieldOfActivity != null ? !fieldOfActivity.equals(client.fieldOfActivity) : client.fieldOfActivity != null)
            return false;
        if (ceo != null ? !ceo.equals(client.ceo) : client.ceo != null) return false;
        if (mailOfOrganization != null ? !mailOfOrganization.equals(client.mailOfOrganization) : client.mailOfOrganization != null)
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
