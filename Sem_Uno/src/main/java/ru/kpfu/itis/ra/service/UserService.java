package ru.kpfu.itis.ra.service;

import ru.kpfu.itis.ra.models.MyUser;

import java.util.List;

/**
 * Created by rubenahmadiev on 24.04.16.
 */

public interface UserService {

    MyUser findById(Integer id);

    List<MyUser> findAll();

    MyUser findByLogin(String login);


}
