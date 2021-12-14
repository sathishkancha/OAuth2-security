package com.sathish.controller;

import com.sathish.model.Credential;
import com.sathish.model.User;
import com.sathish.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    //@PostAuthorize("!hasAuthority('ROLE_ADMIN')")
    public List<User> listAllUser(){
        return userService.findAll();
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody User user){
        return userService.save(user);
    }

    @PostMapping("/login")
    public User loginUser(@RequestBody Credential credential){
        return userService.login(credential);
    }

}
