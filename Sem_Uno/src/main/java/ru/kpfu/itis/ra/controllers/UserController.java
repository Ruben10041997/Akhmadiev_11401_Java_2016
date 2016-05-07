package ru.kpfu.itis.ra.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.ra.models.MyUser;

import javax.servlet.http.HttpServletRequest;


@Controller
public class UserController {

    @RequestMapping(value = "/userpage/", method = RequestMethod.GET)
    public String user(ModelMap map, HttpServletRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().
                getAuthentication();

        if (request.isUserInRole("ROLE_USER") || request.isUserInRole("ROLE_ADMIN")) {
            MyUser currentUser = (MyUser) authentication.getPrincipal();
            map.put("user", currentUser);

        }
        return "userpage";
    }
}
