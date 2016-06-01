package ru.kpfu.itis.ra.controllers;

import javafx.beans.DefaultProperty;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import ru.kpfu.itis.ra.models.Car;
import ru.kpfu.itis.ra.models.ClientsOrder;
import ru.kpfu.itis.ra.repositories.ClientsOrderRepository;
import ru.kpfu.itis.ra.service.CarService;
import ru.kpfu.itis.ra.service.ClientsOrderService;

import java.util.ArrayList;
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


    @RequestMapping(value = "/orders/ajax", method = RequestMethod.GET)
    public @ResponseBody
    List<ClientsOrder> makeJSon(ModelMap map, @RequestParam(defaultValue = "all") String select){
        List<ClientsOrder> orders = new ArrayList<ClientsOrder>();
        if (select.equals("processing")) {
            orders = orderService.getAllbyStatus("processing");

        } else if (select.equals("in progress")) {
            orders = orderService.getAllbyStatus("in progress");

        } else if (select.equals("done")) {
            orders = orderService.getAllbyStatus("done");

        } else if (select.equals("all")) {
            orders = orderService.getAll();

        }
        map.put("orders", orders);
        return orders;
    }


}
