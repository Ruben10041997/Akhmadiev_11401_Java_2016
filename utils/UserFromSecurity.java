package ru.kpfu.itis.ra.utils;

import org.springframework.security.core.context.SecurityContextHolder;
import ru.kpfu.itis.ra.models.MyUser;


public class UserFromSecurity {
    public static MyUser getUsersFromSecurity() {
        return (MyUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}