package ru.kpfu.itis.ra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.ra.models.MyUser;
import ru.kpfu.itis.ra.service.CarService;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    CarService carService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String user(ModelMap map, HttpServletRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().
                getAuthentication();

        if (request.isUserInRole("ROLE_ADMIN")) {
            MyUser currentUser = (MyUser) authentication.getPrincipal();
            map.put("user", currentUser);

        }
        return "admin";
    }

    @RequestMapping(value = "/car_add", method = RequestMethod.GET)
    public String carAddingPage() {
        return "/car_add";
    }

    @RequestMapping(value = "/driver_reg_form", method = RequestMethod.GET)
    public String driverAddingPage() {
        return "/driver_reg_form";
    }

    @RequestMapping(value = "/clients_order_form", method = RequestMethod.GET)
    public String orderAddingPage() {
        return "/clients_order_form";
    }

    @RequestMapping(value = "/repair_request_form", method = RequestMethod.GET)
    public String requestAddingPage() {
        return "/repair_request_form";
    }


}
