package ru.kpfu.itis.ra.service;

import ru.kpfu.itis.ra.models.ClientsOrder;
import ru.kpfu.itis.ra.models.MyUser;

import java.util.List;

/**
 * Created by rubenahmadiev on 07.05.16.
 */
public interface ClientsOrderService {

    List<ClientsOrder> getAll();

    ClientsOrder getById(Integer id);

    ClientsOrder getByOrdersName(String ordersName);

//    List<ClientsOrder> getAllbyStatus(String status);

    ClientsOrder create(ClientsOrder clientsOrder);

    ClientsOrder delete(Integer id);

}
