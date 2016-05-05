package ru.kpfu.itis.ra.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.ra.models.MyUser;
import ru.kpfu.itis.ra.repositories.UserRepository;
import ru.kpfu.itis.ra.service.UserService;


import java.util.List;

/**
 * Created by rubenahmadiev on 24.04.16.
 */

@Service
@Transactional
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    UserRepository userRepository;


    public List<MyUser> findAll() {
        return userRepository.findAll();
    }

    public MyUser findByLogin(String login) {
        return userRepository.findByLogin(login);
    }
    
    public MyUser findById(Integer id) {
        return userRepository.findById(id);
    }

    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
