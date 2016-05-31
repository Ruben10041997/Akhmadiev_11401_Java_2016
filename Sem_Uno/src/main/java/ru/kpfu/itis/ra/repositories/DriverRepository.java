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
public interface DriverRepository extends JpaRepository<Driver, Integer> {

    List<Driver> findAll();

//    List<Driver> findByOrder(ClientsOrder order);

    Driver findById(Integer id);



//    Driver findByCarsId(Integer carsId);




}
