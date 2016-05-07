package ru.kpfu.itis.ra.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.ra.models.Autopark;
import ru.kpfu.itis.ra.models.MyUser;
import ru.kpfu.itis.ra.repositories.AutoparkRepository;
import ru.kpfu.itis.ra.service.AutoparkService;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by rubenahmadiev on 24.04.16.
 */

@Service
@Transactional
public class AutoparkServiceImpl implements AutoparkService {

    @Autowired
    AutoparkRepository autoparkRepository;


    @Transactional
    public Autopark findById(Integer id) {
        return autoparkRepository.findById(id);
    }

    @Transactional
    public List<Autopark> getAll() {
        return autoparkRepository.findAll();
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
    public Autopark create(Autopark car) {
        car.setMark(car.getMark());
        car.setModel(car.getModel());
        car.setYear(car.getYear());
        car.setType(car.getType());
        car.setPower(car.getPower());
        car.setPeopleCapacity(car.getPeopleCapacity());
        car.setBearingCapacity(car.getBearingCapacity());
        car.setMileage(car.getMileage());
        car.setVehicleCondition(car.getVehicleCondition());
        car.setDriverId(car.getDriverId());
        return autoparkRepository.save(car);
    }

    @Transactional
    public Autopark delete(Integer id) {
        Autopark deleteCar = autoparkRepository.findById(id);
        autoparkRepository.delete(deleteCar);
        return deleteCar;
    }
}

