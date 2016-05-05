package ru.kpfu.itis.ra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kpfu.itis.ra.security.UserFromSecurity;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SigninController {

    @Autowired
    private HttpServletRequest request;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String def() {
        request.getSession().setAttribute("user", null);
        return "redirect:/signin";
    }


    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public String getLoginPage(HttpServletRequest request, @RequestParam(value = "error",
            required = false) Boolean error, Model model) {
//        System.out.println("user");
        if (request.isUserInRole("ROLE_USER") || request.isUserInRole("ROLE_ADMIN")) {
            return "redirect:/home";
        }
        if (Boolean.TRUE.equals(error)) {
            model.addAttribute("error", error);
        }
        return "/signin";
    }


}