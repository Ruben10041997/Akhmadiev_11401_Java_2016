package ru.kpfu.itis.ra.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.ra.models.Driver;
import ru.kpfu.itis.ra.repositories.DriverRepository;
import ru.kpfu.itis.ra.service.DriverService;

import java.util.List;

/**
 * Created by rubenahmadiev on 07.05.16.
 */

@Transactional
@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    DriverRepository driverRepository;

    @Transactional
    public List<Driver> getAll() {
        return driverRepository.findAll();
    }

    @Transactional
    public Driver getById(Integer id) {
        return driverRepository.findById(id);
    }

//    @Transactional
//    public Driver getByCarsId(Integer carsId) {
//        return driverRepository.findByCarsId(carsId);
//    }

    @Transactional
    public Driver create(Driver driver) {
        driver.setFirstName(driver.getFirstName());
        driver.setSecondName(driver.getSecondName());
        driver.setYearOfBorn(driver.getYearOfBorn());
        driver.setPersonalExperience(driver.getPersonalExperience());
        driver.setSpecialization(driver.getSpecialization());
        driver.setMail(driver.getMail());
        return driverRepository.save(driver);
    }

    @Transactional
    public Driver delete(Integer id) {
        Driver deleteDriver = driverRepository.findById(id);
        driverRepository.delete(deleteDriver);
        return deleteDriver;
    }
}
