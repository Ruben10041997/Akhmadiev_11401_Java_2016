package ru.kpfu.itis.ra.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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

    @Autowired
    BCryptPasswordEncoder bcryptEncoder;

    @Transactional
    public MyUser getById(Integer id) {
        return userRepository.findById(id);
    }

    @Transactional
    public List<MyUser> getAll() {
        return userRepository.findAll();
    }

    @Transactional
    public MyUser getByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Transactional
    public MyUser create(MyUser user) {
        user.setLogin(user.getLogin());
        user.setPassword(user.getPassword());
        user.setRole(user.getRole());
        return userRepository.save(user);
    }

    @Transactional
    public MyUser delete(Integer id) {
        MyUser deleteUser = userRepository.findById(id);
        userRepository.delete(deleteUser);
        return deleteUser;
    }

    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
