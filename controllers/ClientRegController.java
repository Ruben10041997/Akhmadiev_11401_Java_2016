package ru.kpfu.itis.ra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kpfu.itis.ra.models.Client;
import ru.kpfu.itis.ra.service.ClientService;


/**
 * Created by rubenahmadiev on 26.05.16.
 */

@Controller
public class ClientRegController {

    @Autowired
    ClientService clientService;


    @RequestMapping(value = "/clients_reg_form", method = RequestMethod.POST)
    public String addClient(ModelMap modelMap,
                            @RequestParam("nameoforganization") String nameoforganization,
                            @RequestParam("fieldofactivity") String fieldofactivity,
                            @RequestParam("mailoforganization") String mailoforganization,
                            @RequestParam("ceo") String ceo,
                            @RequestParam("inn") Integer inn)
    {
        Client client = new Client();
        client.setNameoforganization(nameoforganization);
        modelMap.addAttribute("nameoforganization", nameoforganization);
        client.setFieldofactivity(fieldofactivity);
        modelMap.addAttribute("fieldofactivity", fieldofactivity);
        client.setMailoforganization(mailoforganization);
        modelMap.addAttribute("mailoforganization", mailoforganization);
        client.setCeo(ceo);
        modelMap.addAttribute("ceo", ceo);
        client.setInn(inn);
        modelMap.addAttribute("inn", inn);
        clientService.create(client);
        modelMap.addAttribute(client);

        return "redirect:/signin";
    }

    @RequestMapping(value = "/clients_reg_form", method = RequestMethod.GET)
    public String clientAddingPage() {
        return "/clients_reg_form";
    }



}
