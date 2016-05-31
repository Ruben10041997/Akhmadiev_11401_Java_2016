package ru.kpfu.itis.ra.service;

import ru.kpfu.itis.ra.models.Car;

import java.util.List;

/**
 * Created by rubenahmadiev on 25.05.16.
 */
public interface CarService {

    Car findById(Integer id);

    List<Car> getAll();

    Car findByMark(String mark);

    Car create(Car car);

    Car delete(Integer id);

}
