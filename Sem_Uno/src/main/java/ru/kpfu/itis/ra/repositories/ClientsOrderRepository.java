package ru.kpfu.itis.ra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.ra.models.Client;
import ru.kpfu.itis.ra.models.ClientsOrder;


import java.util.List;


/**
 * Created by rubenahmadiev on 07.05.16.
 */

@Repository
public interface ClientsOrderRepository extends JpaRepository<ClientsOrder, Integer> {

    List<ClientsOrder> findAll();

    ClientsOrder findById(Integer id);

    ClientsOrder findByOrdersName(String ordersName);

//    List<ClientsOrder> findAllbyStatus(String status);

}
