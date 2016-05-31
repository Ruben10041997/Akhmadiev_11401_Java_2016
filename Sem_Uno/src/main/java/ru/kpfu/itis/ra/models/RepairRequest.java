package ru.kpfu.itis.ra.models;

import javax.persistence.*;

/**
 * Created by rubenahmadiev on 27.05.16.
 */
@Entity
public class Repairrequest {
    private Integer id;
    private String issues;
    private String status;
    private Integer carsid;
    private String timeoffix;
    private Integer repairspendings;

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
    @Column(name = "issues")
    public String getIssues() {
        return issues;
    }

    public void setIssues(String issues) {
        this.issues = issues;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "carsid")
    public Integer getCarsid() {
        return carsid;
    }

    public void setCarsid(Integer carsid) {
        this.carsid = carsid;
    }

    @Basic
    @Column(name = "timeoffix")
    public String getTimeoffix() {
        return timeoffix;
    }

    public void setTimeoffix(String timeoffix) {
        this.timeoffix = timeoffix;
    }

    @Basic
    @Column(name = "repairspendings")
    public Integer getRepairspendings() {
        return repairspendings;
    }

    public void setRepairspendings(Integer repairspendings) {
        this.repairspendings = repairspendings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Repairrequest that = (Repairrequest) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (issues != null ? !issues.equals(that.issues) : that.issues != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (carsid != null ? !carsid.equals(that.carsid) : that.carsid != null) return false;
        if (timeoffix != null ? !timeoffix.equals(that.timeoffix) : that.timeoffix != null) return false;
        if (repairspendings != null ? !repairspendings.equals(that.repairspendings) : that.repairspendings != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (issues != null ? issues.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (carsid != null ? carsid.hashCode() : 0);
        result = 31 * result + (timeoffix != null ? timeoffix.hashCode() : 0);
        result = 31 * result + (repairspendings != null ? repairspendings.hashCode() : 0);
        return result;
    }
}
