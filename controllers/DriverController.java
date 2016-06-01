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
import ru.kpfu.itis.ra.models.*;
import ru.kpfu.itis.ra.service.ClientsOrderService;
import ru.kpfu.itis.ra.service.DriverService;
import ru.kpfu.itis.ra.service.RepairRequestService;
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

    @Autowired
    RepairRequestService requestService;


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

    @RequestMapping(value = "/requests", method = RequestMethod.GET)
    public String getClientOrders(ModelMap map, HttpServletRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().
                getAuthentication();

        if (request.isUserInRole("ROLE_DRIVER")) {
            MyUser user = (MyUser) authentication.getPrincipal();
            Driver driver = user.getDriver();
            Car car = driver.getCar();

            List<Repairrequest> repairrequests = requestService.getAllByDriverId(driver.getId());
            map.addAttribute("requests", repairrequests);
            map.addAttribute("driver", driver);
            map.addAttribute("car", car);

        }
        return "driverrequests";
    }

    @RequestMapping(value = "/addrequest", method = RequestMethod.POST)
    public String addRepairRequest(ModelMap modelMap, HttpServletRequest request,
                                   @RequestParam("issues") String issues,
                                   @RequestParam("timeoffix") String timeoffix)
    {
        Authentication authentication = SecurityContextHolder.getContext().
                getAuthentication();
        if (request.isUserInRole("ROLE_DRIVER")) {
            MyUser user = (MyUser) authentication.getPrincipal();
            Driver driver = user.getDriver();
            Car car = driver.getCar();
        Repairrequest reprequest = new Repairrequest();
            reprequest.setIssues(issues);
        modelMap.addAttribute("issues", issues);
            reprequest.setStatus("processing");
        modelMap.addAttribute("status", "processing");
            reprequest.setCarsid(car.getId());
        modelMap.addAttribute("carsid", car.getId());
            reprequest.setTimeoffix(timeoffix);
        modelMap.addAttribute("timeoffix", timeoffix);
            reprequest.setRepairspendings(0);
        modelMap.addAttribute("repairspendings", 0);
            reprequest.setDriverid(driver.getId());
            modelMap.addAttribute("clientid", driver.getId());
        requestService.create(reprequest);
        modelMap.addAttribute(request);}

        return "redirect:/driver/requests";
    }

    @RequestMapping(value = "/addrequest", method = RequestMethod.GET)
    public String requestAddingPage() {
        return "/addrequest";
    }



    @RequestMapping(value = "/information", method = RequestMethod.GET)
    public String clientInformation(ModelMap map, HttpServletRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().
                getAuthentication();

        if (request.isUserInRole("ROLE_DRIVER")) {
            MyUser currentUser = (MyUser) authentication.getPrincipal();
            Driver driver = currentUser.getDriver();
            map.put("driver", driver);
        }
        return "clientinformation";
    }



}


