package ru.kpfu.itis.ra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kpfu.itis.ra.models.MyUser;
import ru.kpfu.itis.ra.service.UserService;

/**
 * Created by rubenahmadiev on 06.05.16.
 */
@Controller
public class RegistrationController {

    @Autowired
    UserService us;


    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String signUp(ModelMap model,
                         @RequestParam("login") String login,
                         @RequestParam("password") String password,
                         @RequestParam("role") String role,
                         @RequestParam("email") String email) {
        MyUser user = new MyUser();
        user.setLogin(login);
        model.addAttribute("login", login);
        user.setPassword(password);
        model.addAttribute("password", password);
        user.setRole(role);
        model.addAttribute("role", role);
        user.setEmail(email);
        model.addAttribute("email", email);

        us.create(user);
        model.addAttribute(user);

        if (role.equals("ROLE_DRIVER"))
            return "regdrive";

        if (role.equals("ROLE_CLIENT"))
            return "regdrive";

        return "signin";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registrationPage() {
        return "registration";
    }
}



