package ru.kpfu.itis.ra.security;

/**
 * Created by rubenahmadiev on 02.05.16.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.kpfu.itis.ra.models.MyUser;
import ru.kpfu.itis.ra.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;


public class AuthProviderImpl implements AuthenticationProvider {

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

     @Autowired
     UserRepository userRepository;

    public Authentication authenticate(Authentication authentication) throws
            AuthenticationException, NullPointerException {
        String login = authentication.getName();

        MyUser myUser = userRepository.findByLogin(login);
        if (myUser == null) {
            throw new UsernameNotFoundException("users not found");
        }
        String password = authentication.getCredentials().toString();
        if (!encoder.matches(password, myUser.getPassword()) && !password.equals(myUser.getPassword())) {
            throw new BadCredentialsException("invalid password");
        }

        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority(myUser.getRole()));

        return new UsernamePasswordAuthenticationToken(myUser, null, authorities);
    }

    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}