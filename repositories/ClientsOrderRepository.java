package ru.kpfu.itis.ra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.ra.models.ClientsOrder;
import ru.kpfu.itis.ra.models.Driver;


import java.util.List;


/**
 * Created by rubenahmadiev on 07.05.16.
 */

@Repository
public interface ClientsOrderRepository extends JpaRepository<ClientsOrder, Integer> {

    List<ClientsOrder> findAll();

    ClientsOrder findById(Integer id);

    List<ClientsOrder> findOrderByDriver(Driver driver);

    List<ClientsOrder> findOrderByStatus(String status);

    List<ClientsOrder> findOrderByDriverid(Integer driverId);

    List<ClientsOrder> findOrderByClientid(Integer clientId);

//    ClientsOrder findByOrdersName(String ordersName);

//    List<ClientsOrder> findAllbyStatus(String status);

}
