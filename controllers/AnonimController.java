package ru.kpfu.itis.ra.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by rubenahmadiev on 07.05.16.
 */
@Controller
public class AnonimController {

    @RequestMapping(value = "/anonim" +
            "", method = RequestMethod.GET)
    public String user(ModelMap map, HttpServletRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().
                getAuthentication();

        if (!((request.isUserInRole("ROLE_USER") || request.isUserInRole("ROLE_ADMIN")))) {
            map.put("user", null);
        }
        return "anonim";
    }
}
