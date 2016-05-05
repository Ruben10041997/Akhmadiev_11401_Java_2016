package ru.kpfu.itis.ra.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by rubenahmadiev on 24.04.16.
 */
@Entity
public class Drivers {
    private Integer id;
    private String firstName;
    private String secondName;
    private Integer yearOfBorn;
    private Integer personalExperience;
    private String specialization;
    private Integer totalMileage;
    private Integer moneyPaid;
    private Integer netProfit;
    private String mail;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "second_name")
    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Basic
    @Column(name = "year_of_born")
    public Integer getYearOfBorn() {
        return yearOfBorn;
    }

    public void setYearOfBorn(Integer yearOfBorn) {
        this.yearOfBorn = yearOfBorn;
    }

    @Basic
    @Column(name = "personal_experience")
    public Integer getPersonalExperience() {
        return personalExperience;
    }

    public void setPersonalExperience(Integer personalExperience) {
        this.personalExperience = personalExperience;
    }

    @Basic
    @Column(name = "specialization")
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Basic
    @Column(name = "total_mileage")
    public Integer getTotalMileage() {
        return totalMileage;
    }

    public void setTotalMileage(Integer totalMileage) {
        this.totalMileage = totalMileage;
    }

    @Basic
    @Column(name = "money_paid")
    public Integer getMoneyPaid() {
        return moneyPaid;
    }

    public void setMoneyPaid(Integer moneyPaid) {
        this.moneyPaid = moneyPaid;
    }

    @Basic
    @Column(name = "net_profit")
    public Integer getNetProfit() {
        return netProfit;
    }

    public void setNetProfit(Integer netProfit) {
        this.netProfit = netProfit;
    }

    @Basic
    @Column(name = "mail")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Drivers drivers = (Drivers) o;

        if (id != null ? !id.equals(drivers.id) : drivers.id != null) return false;
        if (firstName != null ? !firstName.equals(drivers.firstName) : drivers.firstName != null) return false;
        if (secondName != null ? !secondName.equals(drivers.secondName) : drivers.secondName != null) return false;
        if (yearOfBorn != null ? !yearOfBorn.equals(drivers.yearOfBorn) : drivers.yearOfBorn != null) return false;
        if (personalExperience != null ? !personalExperience.equals(drivers.personalExperience) : drivers.personalExperience != null)
            return false;
        if (specialization != null ? !specialization.equals(drivers.specialization) : drivers.specialization != null)
            return false;
        if (totalMileage != null ? !totalMileage.equals(drivers.totalMileage) : drivers.totalMileage != null)
            return false;
        if (moneyPaid != null ? !moneyPaid.equals(drivers.moneyPaid) : drivers.moneyPaid != null) return false;
        if (netProfit != null ? !netProfit.equals(drivers.netProfit) : drivers.netProfit != null) return false;
        if (mail != null ? !mail.equals(drivers.mail) : drivers.mail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (yearOfBorn != null ? yearOfBorn.hashCode() : 0);
        result = 31 * result + (personalExperience != null ? personalExperience.hashCode() : 0);
        result = 31 * result + (specialization != null ? specialization.hashCode() : 0);
        result = 31 * result + (totalMileage != null ? totalMileage.hashCode() : 0);
        result = 31 * result + (moneyPaid != null ? moneyPaid.hashCode() : 0);
        result = 31 * result + (netProfit != null ? netProfit.hashCode() : 0);
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        return result;
    }
}
