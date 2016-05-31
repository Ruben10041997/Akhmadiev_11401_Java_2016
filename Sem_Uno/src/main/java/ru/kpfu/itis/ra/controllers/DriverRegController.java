package ru.kpfu.itis.ra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kpfu.itis.ra.models.ClientsOrder;
import ru.kpfu.itis.ra.models.Driver;
import ru.kpfu.itis.ra.service.ClientsOrderService;
import ru.kpfu.itis.ra.service.DriverService;

/**
 * Created by rubenahmadiev on 26.05.16.
 */
@Controller
public class DriverRegController {


    @Autowired
    DriverService driverService;


    @RequestMapping(value = "/driver_reg_form", method = RequestMethod.POST)
    public String addDriver(ModelMap modelMap,
                           @RequestParam("firstname") String firstname,
                           @RequestParam("secondname") String secondname,
                           @RequestParam("yearofborn") Integer yearofborn,
                           @RequestParam("personalexperience") Integer personalexperience,
                           @RequestParam("specialization") String specialization,
                           @RequestParam("totalmileage") Integer totalmileage,
                            @RequestParam("mail") String mail)
    {
        Driver driver = new Driver();
        driver.setFirstName(firstname);
        modelMap.addAttribute("firstname", firstname);
        driver.setSecondName(secondname);
        modelMap.addAttribute("secondname", secondname);
        driver.setYearOfBorn(yearofborn);
        modelMap.addAttribute("yearofborn", yearofborn);
        driver.setPersonalExperience(personalexperience);
        modelMap.addAttribute("personalexperience", personalexperience);
        driver.setSpecialization(specialization);
        modelMap.addAttribute("specialization", specialization);
        driver.setTotalMileage(totalmileage);
        modelMap.addAttribute("totalmileage", totalmileage);
        driver.setMoneyPaid(0);
        modelMap.addAttribute("moneypaid", 0);
        driver.setNetProfit(0);
        modelMap.addAttribute("netprofit", 0);
        driver.setMail(mail);
        modelMap.addAttribute("mail", mail);
        driverService.create(driver);
        modelMap.addAttribute(driver);

        return "redirect:/drivers";
    }

    @RequestMapping(value = "/driver_reg_form", method = RequestMethod.GET)
    public String driverAddingPage() {
        return "/driver_reg_form";
    }


}


