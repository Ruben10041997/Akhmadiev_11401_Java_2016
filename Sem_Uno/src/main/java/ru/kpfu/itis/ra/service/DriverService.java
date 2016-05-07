package ru.kpfu.itis.ra.service;

import ru.kpfu.itis.ra.models.Driver;
import ru.kpfu.itis.ra.models.MyUser;

import java.util.List;

/**
 * Created by rubenahmadiev on 07.05.16.
 */
public interface DriverService {

    List<Driver> getAll();

    Driver getById(Integer id);

//    Driver getByCarsId(Integer carsId);

    Driver create(Driver driver);

    Driver delete(Integer id);

}
