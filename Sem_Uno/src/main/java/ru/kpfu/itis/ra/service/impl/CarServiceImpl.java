package ru.kpfu.itis.ra.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.ra.models.Car;
import ru.kpfu.itis.ra.repositories.CarRepository;
import ru.kpfu.itis.ra.service.CarService;

import java.util.List;

/**
 * Created by rubenahmadiev on 25.05.16.
 */

@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository carRepository;


    @Transactional
    public Car findById(Integer id) {
        return carRepository.findById(id);
    }

    @Transactional
    public List<Car> getAll() {
        return carRepository.findAll();
    }

    public Car findByMark(String mark) {
        return carRepository.findByMark(mark);
    }

//    @Transactional
//    public List<Autopark> getAllbyMark(String mark) {
//        return autoparkRepository.findAllbyMark(mark);
//    }
//
//    @Transactional
//    public List<Autopark> getAllbyType(String type) {
//        return autoparkRepository.findAllbyType(type);
//    }
//
//    @Transactional
//    public List<Autopark> getAllbyYear(Integer year) {
//        return autoparkRepository.findAllbyYear(year);
//    }
//
//    @Transactional
//    public List<Autopark> getAllbyDriverId(Integer carsId) {
//        return autoparkRepository.findAllbyDriverId(carsId);
//    }

    @Transactional
    public Car create(Car car) {
        car.setMark(car.getMark());
        car.setModel(car.getModel());
        car.setYear(car.getYear());
        car.setType(car.getType());
        car.setPower(car.getPower());
        car.setPeopleCapacity(car.getPeopleCapacity());
        car.setBearingCapacity(car.getBearingCapacity());
        car.setMileage(car.getMileage());
        car.setVehicleCondition(car.getVehicleCondition());
        car.setMaintenanceCosts(car.getMaintenanceCosts());
        car.setNetProfit(car.getNetProfit());
        car.setDriverId(car.getDriverId());
        return carRepository.save(car);
    }

    @Transactional
    public Car delete(Integer id) {
        Car deleteCar = carRepository.findById(id);
        carRepository.delete(deleteCar);
        return deleteCar;
    }

}
