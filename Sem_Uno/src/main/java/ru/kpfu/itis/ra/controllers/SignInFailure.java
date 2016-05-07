package ru.kpfu.itis.ra.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by rubenahmadiev on 07.05.16.
 */
@Controller
public class SignInFailure {
    @RequestMapping(value = "/signin_failure", method = RequestMethod.GET)
    public String signinFailure() {
        return "signin_failure";
    }
}
