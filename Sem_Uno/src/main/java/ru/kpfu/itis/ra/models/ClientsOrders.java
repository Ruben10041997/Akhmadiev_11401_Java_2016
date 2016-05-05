package ru.kpfu.itis.ra.models;

import javax.persistence.*;

/**
 * Created by rubenahmadiev on 24.04.16.
 */
@Entity
@Table(name = "clients_orders", schema = "public", catalog = "AutoManagment")
public class ClientsOrders {
    private Integer id;
    private String ordersName;
    private String requiredTransport;
    private String deadline;
    private Integer price;
    private String status;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "orders_name")
    public String getOrdersName() {
        return ordersName;
    }

    public void setOrdersName(String ordersName) {
        this.ordersName = ordersName;
    }

    @Basic
    @Column(name = "required_transport")
    public String getRequiredTransport() {
        return requiredTransport;
    }

    public void setRequiredTransport(String requiredTransport) {
        this.requiredTransport = requiredTransport;
    }

    @Basic
    @Column(name = "deadline")
    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Basic
    @Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
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

        ClientsOrders that = (ClientsOrders) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ordersName != null ? !ordersName.equals(that.ordersName) : that.ordersName != null) return false;
        if (requiredTransport != null ? !requiredTransport.equals(that.requiredTransport) : that.requiredTransport != null)
            return false;
        if (deadline != null ? !deadline.equals(that.deadline) : that.deadline != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ordersName != null ? ordersName.hashCode() : 0);
        result = 31 * result + (requiredTransport != null ? requiredTransport.hashCode() : 0);
        result = 31 * result + (deadline != null ? deadline.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
