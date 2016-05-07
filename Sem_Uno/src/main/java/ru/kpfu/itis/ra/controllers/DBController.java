package ru.kpfu.itis.ra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.ra.models.MyUser;
import ru.kpfu.itis.ra.repositories.AutoparkRepository;
import ru.kpfu.itis.ra.repositories.UserRepository;
import ru.kpfu.itis.ra.service.UserService;
import ru.kpfu.itis.ra.service.impl.UserServiceImpl;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by rubenahmadiev on 01.05.16.
 */
@Controller
@RequestMapping("/db")
public class DBController {

    @Autowired
    UserService userService;

//    @Autowired
    AutoparkRepository autoparkRepository;


    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getUsers(ModelMap model) {


     List<MyUser> users = userService.getAll();

       model.addAttribute("users", users);

        return "users";
    }

}
