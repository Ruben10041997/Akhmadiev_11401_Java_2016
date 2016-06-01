package ru.kpfu.itis.ra.models;

import javax.persistence.*;

/**
 * Created by rubenahmadiev on 24.04.16.
 */
@Entity
public class ClientsOrder {
    private Integer id;
    private String ordersName;
    private String requiredTransport;
    private String deadline;
    private Integer price;
    private String status;
    private Driver driver;
    private Client client;
    private Integer driver_id;
    private Integer client_id;

    public Integer getClientid() {
        return client_id;
    }

    public void setClientid(Integer clientid) {
        this.client_id = clientid;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "driver_id", referencedColumnName = "id")
    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Integer getDriverid() {
        return driver_id;
    }

    public void setDriverid(Integer driverid) {
        this.driver_id = driverid;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clients_order_id_seq")
    @SequenceGenerator(name = "clients_order_id_seq", sequenceName = "client_order_id_sequence", allocationSize = 1)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ordersname")
    public String getOrdersName() {
        return ordersName;
    }

    public void setOrdersName(String ordersName) {
        this.ordersName = ordersName;
    }

    @Basic
    @Column(name = "requiredtransport")
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

        ClientsOrder that = (ClientsOrder) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ordersName != null ? !ordersName.equals(that.ordersName) : that.ordersName != null) return false;
        if (requiredTransport != null ? !requiredTransport.equals(that.requiredTransport) : that.requiredTransport != null)
            return false;
        if (deadline != null ? !deadline.equals(that.deadline) : that.deadline != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (driver != null ? !driver.equals(that.driver) : that.driver != null) return false;


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
        result = 31 * result + (driver != null ? driver.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ClientsOrder{" +
                "id=" + id +
                ", ordersName='" + ordersName + '\'' +
                ", requiredTransport='" + requiredTransport + '\'' +
                ", deadline='" + deadline + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                '}';
    }
}
