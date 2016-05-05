package ru.kpfu.itis.ra.service;

import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.ra.models.Autopark;


import java.util.List;

/**
 * Created by rubenahmadiev on 24.04.16.
 */


public interface AutoparkService {

    Autopark findById(Integer id);

}

