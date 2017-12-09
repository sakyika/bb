package com.sakksoftware.web.bb.service;

import com.sakksoftware.web.bb.model.User;
import com.sakksoftware.web.bb.repository.UserRepository;
import com.sakksoftware.web.bb.security.JwtAuthenticationRequest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomUserService implements UserDetailsService {

    private final Log logger = LogFactory.getLog(this.getClass());

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return userRepository.findByEmail(username);
    }


    public String registerUser(JwtAuthenticationRequest requestUser) {

        User newUser = new  User(requestUser.getUsername(), new BCryptPasswordEncoder().encode(requestUser.getPassword()));

        userRepository.save(newUser);

        logger.warn("The objectId is: " + newUser.getId());

        return newUser.getId();

    }
}
