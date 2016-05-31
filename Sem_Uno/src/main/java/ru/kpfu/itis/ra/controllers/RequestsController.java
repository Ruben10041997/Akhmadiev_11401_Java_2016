package ru.kpfu.itis.ra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kpfu.itis.ra.models.ClientsOrder;
import ru.kpfu.itis.ra.models.Repairrequest;
import ru.kpfu.itis.ra.service.ClientsOrderService;
import ru.kpfu.itis.ra.service.RepairRequestService;

/**
 * Created by rubenahmadiev on 27.05.16.
 */
@Controller
public class RequestsController {

    @Autowired
    RepairRequestService requestService;


    @RequestMapping(value = "/repair_request_form", method = RequestMethod.POST)
    public String addRepairRequest(ModelMap modelMap,
                           @RequestParam("issues") String issues,
                           @RequestParam("carsid") Integer carsid,
                           @RequestParam("timeoffix") String timeoffix)
    {
        Repairrequest request = new Repairrequest();
        request.setIssues(issues);
        modelMap.addAttribute("issues", issues);
        request.setStatus("processing");
        modelMap.addAttribute("status", "processing");
        request.setCarsid(carsid);
        modelMap.addAttribute("carsid", carsid);
        request.setTimeoffix(timeoffix);
        modelMap.addAttribute("timeoffix", timeoffix);
        request.setRepairspendings(0);
        modelMap.addAttribute("repairspendings", 0);
        requestService.create(request);
        modelMap.addAttribute(request);

        return "redirect:/requests";
    }

    @RequestMapping(value = "/repair_request_form", method = RequestMethod.GET)
    public String requestAddingPage() {
        return "/repair_request_form";
    }

}
