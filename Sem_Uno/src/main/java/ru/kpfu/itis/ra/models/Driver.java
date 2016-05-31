package ru.kpfu.itis.ra.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by rubenahmadiev on 24.04.16.
 */
@Entity
public class Driver {
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
    private List<ClientsOrder> orders;
    private MyUser user;


    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "driver_id")
    public List<ClientsOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ClientsOrder> orders) {
        this.orders = orders;
    }



    @OneToOne
    @JoinColumn(name= "id", referencedColumnName = "driverid")
    public MyUser getUser() {
        return user;
    }

    public void setUser(MyUser user) {
        this.user = user;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "driver_id_seq")
    @SequenceGenerator(name = "driver_id_seq", sequenceName = "driver_id_sequence", allocationSize = 1)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "firstname")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "secondname")
    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Basic
    @Column(name = "yearofborn")
    public Integer getYearOfBorn() {
        return yearOfBorn;
    }

    public void setYearOfBorn(Integer yearOfBorn) {
        this.yearOfBorn = yearOfBorn;
    }

    @Basic
    @Column(name = "personalexperience")
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
    @Column(name = "totalmileage")
    public Integer getTotalMileage() {
        return totalMileage;
    }

    public void setTotalMileage(Integer totalMileage) {
        this.totalMileage = totalMileage;
    }

    @Basic
    @Column(name = "moneypaid")
    public Integer getMoneyPaid() {
        return moneyPaid;
    }

    public void setMoneyPaid(Integer moneyPaid) {
        this.moneyPaid = moneyPaid;
    }

    @Basic
    @Column(name = "netprofit")
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
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", yearOfBorn=" + yearOfBorn +
                ", personalExperience=" + personalExperience +
                ", specialization='" + specialization + '\'' +
                ", totalMileage=" + totalMileage +
                ", moneyPaid=" + moneyPaid +
                ", netProfit=" + netProfit +
                ", mail='" + mail + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driver driver = (Driver) o;

        if (id != null ? !id.equals(driver.id) : driver.id != null) return false;
        if (firstName != null ? !firstName.equals(driver.firstName) : driver.firstName != null) return false;
        if (secondName != null ? !secondName.equals(driver.secondName) : driver.secondName != null) return false;
        if (yearOfBorn != null ? !yearOfBorn.equals(driver.yearOfBorn) : driver.yearOfBorn != null) return false;
        if (personalExperience != null ? !personalExperience.equals(driver.personalExperience) : driver.personalExperience != null)
            return false;
        if (specialization != null ? !specialization.equals(driver.specialization) : driver.specialization != null)
            return false;
        if (totalMileage != null ? !totalMileage.equals(driver.totalMileage) : driver.totalMileage != null)
            return false;
        if (moneyPaid != null ? !moneyPaid.equals(driver.moneyPaid) : driver.moneyPaid != null) return false;
        if (netProfit != null ? !netProfit.equals(driver.netProfit) : driver.netProfit != null) return false;
        if (mail != null ? !mail.equals(driver.mail) : driver.mail != null) return false;

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
