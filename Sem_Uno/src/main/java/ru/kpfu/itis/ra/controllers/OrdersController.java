package ru.kpfu.itis.ra.controllers;

import javafx.beans.DefaultProperty;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kpfu.itis.ra.models.Car;
import ru.kpfu.itis.ra.models.ClientsOrder;
import ru.kpfu.itis.ra.repositories.ClientsOrderRepository;
import ru.kpfu.itis.ra.service.CarService;
import ru.kpfu.itis.ra.service.ClientsOrderService;

import java.util.List;

/**
 * Created by rubenahmadiev on 25.05.16.
 */
@Controller
public class OrdersController {

    @Autowired
    ClientsOrderService orderService;


    @RequestMapping(value = "/clients_order_form", method = RequestMethod.POST)
    public String addOrder(ModelMap modelMap,
                         @RequestParam("ordersname") String ordersname,
                         @RequestParam("requiredtransport") String requiredtransport,
                         @RequestParam("deadline") String deadline,
                         @RequestParam("price") Integer price)
                       {
        ClientsOrder order = new ClientsOrder();
                           order.setOrdersName(ordersname);
        modelMap.addAttribute("ordersname", ordersname);
                           order.setRequiredTransport(requiredtransport);
        modelMap.addAttribute("requiredtransport", requiredtransport);
                           order.setDeadline(deadline);
        modelMap.addAttribute("deadline", deadline);
                           order.setPrice(price);
        modelMap.addAttribute("price", price);
                           order.setStatus("processing");
                           modelMap.addAttribute("status", "processing");
        orderService.create(order);
        modelMap.addAttribute(order);

        return "redirect:/orders";
    }

    @RequestMapping(value = "/clients_order_form", method = RequestMethod.GET)
    public String orderAddingPage() {
        return "/clients_order_form";
    }


}
