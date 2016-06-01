package ru.kpfu.itis.ra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.ra.models.*;
import ru.kpfu.itis.ra.service.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by rubenahmadiev on 01.05.16.
 */
@Controller
//@RequestMapping("/db")
public class DBController {

    @Autowired
    UserService userService;

    @Autowired
    CarService carService;

    @Autowired
    ClientsOrderService orderService;

    @Autowired
    DriverService driverService;

    @Autowired
    ClientService clientService;

    @Autowired
    RepairRequestService requestService;



    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getUsers(ModelMap model) {


     List<MyUser> users = userService.getAll();

       model.addAttribute("users", users);

        return "users";
    }

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public String getCars(ModelMap model) {

        List<Car> cars = carService.getAll();

        model.addAttribute("cars", cars);

        return "cars";
    }

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public String getOrders(ModelMap model) {

        List<ClientsOrder> orders = orderService.getAll();

        model.addAttribute("orders", orders);

        return "orders";
    }

    @RequestMapping(value = "/drivers", method = RequestMethod.GET)
    public String getDrivers(ModelMap model) {

        List<Driver> drivers = driverService.getAll();

        model.addAttribute("drivers", drivers);

        return "drivers";
    }

    @RequestMapping(value = "/clients", method = RequestMethod.GET)
    public String getClients(ModelMap model) {

        List<Client> clients = clientService.getAll();

        model.addAttribute("clients", clients);

        return "clients";
    }

    @RequestMapping(value = "/requests", method = RequestMethod.GET)
    public String getRepairRequests(ModelMap model) {

        List<Repairrequest> requests = requestService.getAll();

        model.addAttribute("requests", requests);

        return "requests";
    }

    @RequestMapping(value = "/delete/users/{id:\\d+}", method = RequestMethod.POST)
    public String deleteUser(@PathVariable String id) {
        userService.delete(Integer.parseInt(id));
        return "redirect:/users";
    }

    @RequestMapping(value = "/delete/cars/{id:\\d+}", method = RequestMethod.POST)
    public String deleteCar(@PathVariable String id) {
        carService.delete(Integer.parseInt(id));
        return "redirect:/cars";
    }

    @RequestMapping(value = "/delete/orders/{id:\\d+}", method = RequestMethod.POST)
    public String deleteOrder(@PathVariable String id) {
        orderService.delete(Integer.parseInt(id));
        return "redirect:/orders";
    }

    @RequestMapping(value = "/delete/drivers/{id:\\d+}", method = RequestMethod.POST)
    public String deleteDriver(@PathVariable String id) {
        driverService.delete(Integer.parseInt(id));
        return "redirect:/drivers";
    }

    @RequestMapping(value = "/delete/clients/{id:\\d+}", method = RequestMethod.POST)
    public String deleteClient(@PathVariable String id) {
        clientService.delete(Integer.parseInt(id));
        return "redirect:/clients";
    }

    @RequestMapping(value = "/delete/requests/{id:\\d+}", method = RequestMethod.POST)
    public String deleteRequest(@PathVariable String id) {
        requestService.delete(Integer.parseInt(id));
        return "redirect:/requests";
    }


}
