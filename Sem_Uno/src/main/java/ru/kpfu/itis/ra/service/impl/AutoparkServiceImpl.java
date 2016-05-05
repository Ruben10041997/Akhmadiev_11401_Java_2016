package ru.kpfu.itis.ra.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.ra.models.Autopark;
import ru.kpfu.itis.ra.repositories.AutoparkRepository;
import ru.kpfu.itis.ra.service.AutoparkService;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.annotation.Resource;

/**
 * Created by rubenahmadiev on 24.04.16.
 */

@Service
@Transactional
public class AutoparkServiceImpl implements AutoparkService {

    @Autowired
    AutoparkRepository autoparkRepository;


    public Autopark findById(Integer id) {
        return autoparkRepository.findById(id);
    }
}

