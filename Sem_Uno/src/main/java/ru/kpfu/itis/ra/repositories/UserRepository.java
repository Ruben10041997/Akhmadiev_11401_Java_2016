package ru.kpfu.itis.ra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import ru.kpfu.itis.ra.models.MyUser;


/**
 * Created by rubenahmadiev on 24.04.16.
 */

@Repository
public interface UserRepository extends JpaRepository<MyUser, Integer> {

        MyUser findById(Integer id);

     MyUser findByLogin(String login);

    }

