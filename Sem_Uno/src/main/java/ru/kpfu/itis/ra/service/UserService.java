package ru.kpfu.itis.ra.service;

import ru.kpfu.itis.ra.models.MyUser;

import java.util.List;

/**
 * Created by rubenahmadiev on 24.04.16.
 */

public interface UserService {

    MyUser getById(Integer id);

    List<MyUser> getAll();

    MyUser getByLogin(String login);

    MyUser create(MyUser user);

    MyUser delete(Integer id);


}
