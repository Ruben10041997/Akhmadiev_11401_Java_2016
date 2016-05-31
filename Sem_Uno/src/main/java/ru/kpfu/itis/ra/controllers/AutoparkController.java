package ru.kpfu.itis.ra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kpfu.itis.ra.models.Car;
import ru.kpfu.itis.ra.service.CarService;

/**
 * Created by rubenahmadiev on 07.05.16.
 */
@Controller
public class AutoparkController {

    @Autowired
    CarService carService;


    @RequestMapping(value = "/car_add", method = RequestMethod.POST)
    public String addCar(ModelMap modelMap,
                         @RequestParam("mark") String mark,
                         @RequestParam("model") String model,
                         @RequestParam("year") Integer year,
                         @RequestParam("type") String type,
                         @RequestParam("power") Integer power,
                         @RequestParam("people_capacity") Integer people_capacity,
                         @RequestParam("bearing_capacity") Integer bearing_capacity,
                         @RequestParam("mileage") Integer mileage,
                         @RequestParam("vehicle_condition") Integer vehicle_condition) {
        Car autopark = new Car();
        autopark.setMark(mark);
        modelMap.addAttribute("mark", mark);
        autopark.setModel(model);
        modelMap.addAttribute("model", model);
        autopark.setYear(year);
        modelMap.addAttribute("year", year);
        autopark.setType(type);
        modelMap.addAttribute("type", type);
        autopark.setPower(power);
        modelMap.addAttribute("power", power);
        autopark.setPeopleCapacity(people_capacity);
        modelMap.addAttribute("people_capacity", people_capacity);
        autopark.setBearingCapacity(bearing_capacity);
        modelMap.addAttribute("bearing_capacity", bearing_capacity);
        autopark.setMileage(mileage);
        modelMap.addAttribute("mileage", mileage);
        autopark.setVehicleCondition(vehicle_condition);
        modelMap.addAttribute("vehicle_condition", vehicle_condition);
//        autopark.setMaintenanceCosts(maintenance_costs);
//        modelMap.addAttribute("maintenance_costs", maintenance_costs);
//        autopark.setNetProfit(net_profit);
//        modelMap.addAttribute("net_profit", net_profit);

        carService.create(autopark);
        modelMap.addAttribute(autopark);

        return "redirect:/cars";
    }

    @RequestMapping(value = "/car_add", method = RequestMethod.GET)
    public String carAddingPage() {
        return "/car_add";
    }
}
