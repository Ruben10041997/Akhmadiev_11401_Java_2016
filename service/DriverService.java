package ru.kpfu.itis.ra.service;

import ru.kpfu.itis.ra.models.ClientsOrder;
import ru.kpfu.itis.ra.models.Driver;

import java.util.List;

/**
 * Created by rubenahmadiev on 07.05.16.
 */
public interface DriverService {

    List<Driver> getAll();

  //  List<Driver> getByOrder(ClientsOrder order);

    Driver getById(Integer id);

    Driver create(Driver driver);

    Driver delete(Integer id);

}
