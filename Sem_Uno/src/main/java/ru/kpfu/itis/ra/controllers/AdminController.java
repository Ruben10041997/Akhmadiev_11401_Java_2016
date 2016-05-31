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

//    @RequestMapping(value = "/autopark", method = RequestMethod.GET)
//    public String getAutopark(ModelMap map) {
//        List<Autopark> autoparks = autoparkService.getAll();
//        map.addAttribute("autopark", autoparks);
//        return "autopark";
//    }

//    @RequestMapping(value = "/autopark/car_add", method = RequestMethod.POST)
//    public String addCar(ModelMap modelMap,
//                         @RequestParam("mark") String mark,
//                         @RequestParam("model") String model,
//                         @RequestParam("year") Integer year,
//                         @RequestParam("type") String type,
//                         @RequestParam("power") Integer power,
//                         @RequestParam("people_capacity") Integer people_capacity,
//                         @RequestParam("bearing_capacity") Integer bearing_capacity,
//                         @RequestParam("mileage") Integer mileage,
//                         @RequestParam("vehicle_condition") Integer vehicle_condition,
//                         @RequestParam("maintenance_costs") Integer maintenance_costs,
//                         @RequestParam("net_profit") Integer net_profit) {
//        Autopark autopark = new Autopark();
//        autopark.setMark(mark);
//        modelMap.addAttribute("mark", mark);
//        autopark.setModel(model);
//        modelMap.addAttribute("model", model);
//        autopark.setYear(year);
//        modelMap.addAttribute("year", year);
//        autopark.setType(type);
//        modelMap.addAttribute("type", type);
//        autopark.setPower(power);
//        modelMap.addAttribute("power", power);
//        autopark.setPeopleCapacity(people_capacity);
//        modelMap.addAttribute("people_capacity", people_capacity);
//        autopark.setBearingCapacity(bearing_capacity);
//        modelMap.addAttribute("bearing_capacity", bearing_capacity);
//        autopark.setMileage(mileage);
//        modelMap.addAttribute("mileage", mileage);
//        autopark.setVehicleCondition(vehicle_condition);
//        modelMap.addAttribute("vehicle_condition", vehicle_condition);
//        autopark.setMaintenanceCosts(maintenance_costs);
//        modelMap.addAttribute("maintenance_costs", maintenance_costs);
//        autopark.setNetProfit(net_profit);
//        modelMap.addAttribute("net_profit", net_profit);
//
//        autoparkService.create(autopark);
//        modelMap.addAttribute(autopark);
//
//        return "redirect:/autopark";
//    }
}
