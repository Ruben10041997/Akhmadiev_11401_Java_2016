package ru.kpfu.itis.ra.service;

import ru.kpfu.itis.ra.models.ClientsOrder;
import ru.kpfu.itis.ra.models.Driver;

import java.util.List;

/**
 * Created by rubenahmadiev on 07.05.16.
 */
public interface ClientsOrderService {

    List<ClientsOrder> getAll();

    List<ClientsOrder> getByDriver(Driver driver);

    ClientsOrder getById(Integer id);

//    ClientsOrder getByOrdersName(String ordersName);

    List<ClientsOrder> getAllbyStatus(String status);

    List<ClientsOrder> getAllbyDriverid(Integer driverId);

    List<ClientsOrder> getAllbyClientid(Integer clientId);

    ClientsOrder create(ClientsOrder clientsOrder);

    ClientsOrder delete(Integer id);

    ClientsOrder update(ClientsOrder clientsOrder);

}
