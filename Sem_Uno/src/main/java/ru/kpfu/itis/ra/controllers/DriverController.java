package ru.kpfu.itis.ra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kpfu.itis.ra.models.ClientsOrder;
import ru.kpfu.itis.ra.models.Driver;
import ru.kpfu.itis.ra.models.MyUser;
import ru.kpfu.itis.ra.service.ClientsOrderService;
import ru.kpfu.itis.ra.service.DriverService;
import ru.kpfu.itis.ra.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by rubenahmadiev on 25.05.16.
 */

@Controller
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    ClientsOrderService orderService;

    @Autowired
    DriverService driverService;

    @Autowired
    UserService userService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String user(ModelMap map, HttpServletRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().
                getAuthentication();

        if (request.isUserInRole("ROLE_DRIVER")) {
            MyUser currentUser = (MyUser) authentication.getPrincipal();
            Driver driver = currentUser.getDriver();
            map.put("user", currentUser);
            map.put("driver", driver);

        }
        return "driver";
    }

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public String getOrders(ModelMap model) {


        List<ClientsOrder> orders = orderService.getAllbyStatus("processing");

        model.addAttribute("orders", orders);

        return "driverorders";
    }


    @RequestMapping(value = "/acceptorder", method = RequestMethod.GET)
    public String getDriverOrders(ModelMap map, HttpServletRequest request, @RequestParam int id) {
        Authentication authentication = SecurityContextHolder.getContext().
                getAuthentication();

        if (request.isUserInRole("ROLE_DRIVER")) {
            MyUser user = (MyUser) authentication.getPrincipal();
            Driver driver = user.getDriver();
            ClientsOrder order = orderService.getById(id);
            order.setId(id);
            order.setDriverid(driver.getId());
            order.setStatus("in progress");
            orderService.update(order);
            List<ClientsOrder> ownorders = orderService.getAllbyDriverid(driver.getId());
            map.addAttribute("orders", ownorders);
            map.addAttribute("driver", driver);

        }
        return "acceptorder";
    }


    @RequestMapping(value = "/ownorders",method = RequestMethod.GET)
    public String getDriverOrders(ModelMap map, HttpServletRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().
                getAuthentication();

        if (request.isUserInRole("ROLE_DRIVER")) {
            MyUser user = (MyUser) authentication.getPrincipal();
            Driver driver = user.getDriver();
            List<ClientsOrder> ownorders = orderService.getAllbyDriverid(driver.getId());
            map.addAttribute("orders", ownorders);
            map.addAttribute("driver", driver);

        }
        return "owndriverorders";
    }



}


