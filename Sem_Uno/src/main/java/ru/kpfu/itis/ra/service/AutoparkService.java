package ru.kpfu.itis.ra.service;

import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.ra.models.Autopark;
import ru.kpfu.itis.ra.models.MyUser;


import java.util.List;

/**
 * Created by rubenahmadiev on 24.04.16.
 */


public interface AutoparkService {

    Autopark findById(Integer id);

    List<Autopark> getAll();

//    List<Autopark> getAllbyMark(String mark);
//
//    List<Autopark> getAllbyType(String type);
//
//    List<Autopark> getAllbyYear(Integer year);
//
//    List<Autopark> getAllbyDriverId(Integer carsId);

    Autopark create(Autopark car);

    Autopark delete(Integer id);

}

