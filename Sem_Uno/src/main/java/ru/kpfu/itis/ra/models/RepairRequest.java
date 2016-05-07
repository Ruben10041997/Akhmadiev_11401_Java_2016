package ru.kpfu.itis.ra.models;

import javax.persistence.*;

/**
 * Created by rubenahmadiev on 24.04.16.
 */
@Entity
@Table(name = "repair_request", schema = "public", catalog = "AutoManagment")
public class RepairRequest {
    private Integer id;
    private Integer carsId;
    private String issues;
    private String timeFix;
    private Integer repairSpending;
    private String status;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "repair_request_id_seq")
    @SequenceGenerator(name = "repair_request_id_seq", sequenceName = "repair_request_id_sequence", allocationSize = 1)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cars_id")
    public Integer getCarsId() {
        return carsId;
    }

    public void setCarsId(Integer carsId) {
        this.carsId = carsId;
    }

    @Basic
    @Column(name = "issues")
    public String getIssues() {
        return issues;
    }

    public void setIssues(String issues) {
        this.issues = issues;
    }

    @Basic
    @Column(name = "time_fix")
    public String getTimeFix() {
        return timeFix;
    }

    public void setTimeFix(String timeFix) {
        this.timeFix = timeFix;
    }

    @Basic
    @Column(name = "repair_spending")
    public Integer getRepairSpending() {
        return repairSpending;
    }

    public void setRepairSpending(Integer repairSpending) {
        this.repairSpending = repairSpending;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RepairRequest that = (RepairRequest) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (carsId != null ? !carsId.equals(that.carsId) : that.carsId != null) return false;
        if (issues != null ? !issues.equals(that.issues) : that.issues != null) return false;
        if (timeFix != null ? !timeFix.equals(that.timeFix) : that.timeFix != null) return false;
        if (repairSpending != null ? !repairSpending.equals(that.repairSpending) : that.repairSpending != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (carsId != null ? carsId.hashCode() : 0);
        result = 31 * result + (issues != null ? issues.hashCode() : 0);
        result = 31 * result + (timeFix != null ? timeFix.hashCode() : 0);
        result = 31 * result + (repairSpending != null ? repairSpending.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
