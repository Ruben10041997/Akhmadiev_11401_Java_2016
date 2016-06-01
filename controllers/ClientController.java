package ru.kpfu.itis.ra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kpfu.itis.ra.models.Client;
import ru.kpfu.itis.ra.models.ClientsOrder;
import ru.kpfu.itis.ra.models.Driver;
import ru.kpfu.itis.ra.models.MyUser;
import ru.kpfu.itis.ra.service.ClientService;
import ru.kpfu.itis.ra.service.ClientsOrderService;
import ru.kpfu.itis.ra.service.DriverService;
import ru.kpfu.itis.ra.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by rubenahmadiev on 25.05.16.
 */

@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientsOrderService orderService;

    @Autowired
    ClientService clientService;

    @Autowired
    UserService userService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String user(ModelMap map, HttpServletRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().
                getAuthentication();

        if (request.isUserInRole("ROLE_CLIENT")) {
            MyUser currentUser = (MyUser) authentication.getPrincipal();
            Client client = currentUser.getClient();
            map.put("user", currentUser);
            map.put("client", client);

        }
        return "client";
    }


    @RequestMapping(value = "/myorders", method = RequestMethod.GET)
    public String getClientOrders(ModelMap map, HttpServletRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().
                getAuthentication();

        if (request.isUserInRole("ROLE_CLIENT")) {
            MyUser user = (MyUser) authentication.getPrincipal();
            Client client = user.getClient();

            List<ClientsOrder> ownorders = orderService.getAllbyClientid(client.getId());
            map.addAttribute("orders", ownorders);
            map.addAttribute("client", client);

        }
        return "clientorders";
    }


    @RequestMapping(value = "/addorder", method = RequestMethod.POST)
    public String addOrder(ModelMap modelMap, HttpServletRequest request,
                           @RequestParam("ordersname") String ordersname,
                           @RequestParam("requiredtransport") String requiredtransport,
                           @RequestParam("deadline") String deadline,
                           @RequestParam("price") Integer price) {
        Authentication authentication = SecurityContextHolder.getContext().
                getAuthentication();
        if (request.isUserInRole("ROLE_CLIENT")) {
            MyUser user = (MyUser) authentication.getPrincipal();
            Client client = user.getClient();

            ClientsOrder order = new ClientsOrder();
            order.setOrdersName(ordersname);
            modelMap.addAttribute("ordersname", ordersname);
            order.setRequiredTransport(requiredtransport);
            modelMap.addAttribute("requiredtransport", requiredtransport);
            order.setDeadline(deadline);
            modelMap.addAttribute("deadline", deadline);
            order.setPrice(price);
            modelMap.addAttribute("price", price);
            order.setClientid(client.getId());
            modelMap.addAttribute("clientid", client.getId());
            order.setStatus("processing");
            modelMap.addAttribute("status", "processing");
            orderService.create(order);
            modelMap.addAttribute(order);
        }

        return "redirect:/client/myorders";
    }


    @RequestMapping(value = "/addorder", method = RequestMethod.GET)
    public String orderAddingPage() {
        return "/addorder";
    }


    @RequestMapping(value = "/information", method = RequestMethod.GET)
    public String clientInformation(ModelMap map, HttpServletRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().
                getAuthentication();

        if (request.isUserInRole("ROLE_CLIENT")) {
            MyUser currentUser = (MyUser) authentication.getPrincipal();
            Client client = currentUser.getClient();
            map.put("client", client);
        }
        return "clientinformation";
    }


}
