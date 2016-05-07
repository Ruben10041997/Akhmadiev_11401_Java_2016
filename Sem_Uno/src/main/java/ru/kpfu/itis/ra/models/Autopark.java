package ru.kpfu.itis.ra.models;

import javax.persistence.*;

/**
 * Created by rubenahmadiev on 24.04.16.
 */
@Entity
public class Autopark {
    private Integer id;
    private String mark;
    private String model;
    private Integer year;
    private String type;
    private Integer power;
    private Integer peopleCapacity;
    private Integer bearingCapacity;
    private Integer mileage;
    private Integer vehicleCondition;
    private Integer maintenanceCosts;
    private Integer netProfit;
    private Integer driverId;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "autopark_id_seq")
    @SequenceGenerator(name = "autopark_id_seq", sequenceName = "autopark_id_sequence", allocationSize = 1)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "mark")
    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Basic
    @Column(name = "model")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "year")
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "power")
    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @Basic
    @Column(name = "people_capacity")
    public Integer getPeopleCapacity() {
        return peopleCapacity;
    }

    public void setPeopleCapacity(Integer peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
    }

    @Basic
    @Column(name = "bearing_capacity")
    public Integer getBearingCapacity() {
        return bearingCapacity;
    }

    public void setBearingCapacity(Integer bearingCapacity) {
        this.bearingCapacity = bearingCapacity;
    }

    @Basic
    @Column(name = "mileage")
    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    @Basic
    @Column(name = "vehicle_condition")
    public Integer getVehicleCondition() {
        return vehicleCondition;
    }

    public void setVehicleCondition(Integer vehicleCondition) {
        this.vehicleCondition = vehicleCondition;
    }

    @Basic
    @Column(name = "maintenance costs")
    public Integer getMaintenanceCosts() {
        return maintenanceCosts;
    }

    public void setMaintenanceCosts(Integer maintenanceCosts) {
        this.maintenanceCosts = maintenanceCosts;
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
    @Column(name = "driver_id")
    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Autopark autopark = (Autopark) o;

        if (id != null ? !id.equals(autopark.id) : autopark.id != null) return false;
        if (mark != null ? !mark.equals(autopark.mark) : autopark.mark != null) return false;
        if (model != null ? !model.equals(autopark.model) : autopark.model != null) return false;
        if (year != null ? !year.equals(autopark.year) : autopark.year != null) return false;
        if (type != null ? !type.equals(autopark.type) : autopark.type != null) return false;
        if (power != null ? !power.equals(autopark.power) : autopark.power != null) return false;
        if (peopleCapacity != null ? !peopleCapacity.equals(autopark.peopleCapacity) : autopark.peopleCapacity != null)
            return false;
        if (bearingCapacity != null ? !bearingCapacity.equals(autopark.bearingCapacity) : autopark.bearingCapacity != null)
            return false;
        if (mileage != null ? !mileage.equals(autopark.mileage) : autopark.mileage != null) return false;
        if (vehicleCondition != null ? !vehicleCondition.equals(autopark.vehicleCondition) : autopark.vehicleCondition != null)
            return false;
        if (maintenanceCosts != null ? !maintenanceCosts.equals(autopark.maintenanceCosts) : autopark.maintenanceCosts != null)
            return false;
        if (netProfit != null ? !netProfit.equals(autopark.netProfit) : autopark.netProfit != null) return false;
        if (driverId != null ? !driverId.equals(autopark.driverId) : autopark.driverId != null) return false;

        return true;
    }

    @Override
    public String toString() {
        return "Autopark{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", type='" + type + '\'' +
                ", power=" + power +
                ", peopleCapacity=" + peopleCapacity +
                ", bearingCapacity=" + bearingCapacity +
                ", mileage=" + mileage +
                ", vehicleCondition=" + vehicleCondition +
                ", maintenanceCosts=" + maintenanceCosts +
                ", netProfit=" + netProfit +
                ", driverId=" + driverId +
                '}';
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (mark != null ? mark.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (power != null ? power.hashCode() : 0);
        result = 31 * result + (peopleCapacity != null ? peopleCapacity.hashCode() : 0);
        result = 31 * result + (bearingCapacity != null ? bearingCapacity.hashCode() : 0);
        result = 31 * result + (mileage != null ? mileage.hashCode() : 0);
        result = 31 * result + (vehicleCondition != null ? vehicleCondition.hashCode() : 0);
        result = 31 * result + (maintenanceCosts != null ? maintenanceCosts.hashCode() : 0);
        result = 31 * result + (netProfit != null ? netProfit.hashCode() : 0);
        result = 31 * result + (driverId != null ? driverId.hashCode() : 0);
        return result;
    }
}
