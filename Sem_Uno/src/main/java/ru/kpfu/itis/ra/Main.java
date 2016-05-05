package ru.kpfu.itis.ra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import ru.kpfu.itis.ra.models.MyUser;
import ru.kpfu.itis.ra.repositories.UserRepository;
import ru.kpfu.itis.ra.service.UserService;

import java.util.List;

/**
 * Created by rubenahmadiev on 24.04.16.
 */

public class Main {

    @Autowired
    UserService us;

    public MyUser getUser(String login) {
        return us.findByLogin(login);
    }

    public static void main(String[] args) {
  /*      Autopark bmw_525xi = new Autopark();
        bmw_525xi.setId(10);
        bmw_525xi.setMark("BMW");
        bmw_525xi.setModel("525xi");
        bmw_525xi.setYear(2009);
        bmw_525xi.setType("Легковая");
        bmw_525xi.setPower(220);
        bmw_525xi.setPeopleCapacity(5);
        bmw_525xi.setBearingCapacity(1000);
        bmw_525xi.setMileage(60000);
        bmw_525xi.setVehicleCondition(9);
        bmw_525xi.setMaintenanceCosts(240000);
        bmw_525xi.setNetProfit(590000);
//        bmw_525xi.setDriverId(1);
        AutoparkServiceImpl autoparkService = new AutoparkServiceImpl();
        autoparkService.add(bmw_525xi);
        System.out.println("Автомобиль успешно добавлен!");
        System.out.println(autoparkService.get(1).getMileage());*/

       /* UserServiceImpl usersService = new UserServiceImpl();
        usersService.findById(1);*/

//        ApplicationContext ac =
//                new ClassPathXmlApplicationContext("persistence-config.xml");
//        UserRepository us = ac.getBean(UserRepository.class);

      //  MyUser u = us.findById(2);
//        System.out.println(u);
//        MyUser u2 = us.findByLogin("admin");
//        System.out.println(u2);
//        List<MyUser> usersList = userRepository.findAll();
//        for (MyUser users: usersList)
//            System.out.println(users);




        }

    }

