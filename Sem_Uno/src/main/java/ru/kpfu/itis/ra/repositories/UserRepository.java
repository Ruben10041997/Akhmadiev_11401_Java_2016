package ru.kpfu.itis.ra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.ra.models.MyUser;

import java.util.List;


/**
 * Created by rubenahmadiev on 24.04.16.
 */

@Repository
public interface UserRepository extends CrudRepository<MyUser, Integer> {

        MyUser findById(Integer id);

        MyUser findByLogin(String login);

        List<MyUser> findAll();


    }

