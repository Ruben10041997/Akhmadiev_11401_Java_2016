package ru.kpfu.itis.ra.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kpfu.itis.ra.models.MyUser;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by rubenahmadiev on 02.05.16.
 */

@Controller
public class AccessDenyController {
    @RequestMapping("/accessdeny")
    public String errorPage(Model model, HttpServletRequest request) {
        MyUser myUserList = (MyUser) request.getSession().getAttribute("users");
        model.addAttribute("user", myUserList);
        return "/accessdeny";
    }
}
