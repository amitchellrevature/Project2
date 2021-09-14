package com.revature.Project2.controller;

import com.revature.Project2.entity.Users;
import com.revature.Project2.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @Autowired
    private UsersService service;


    @PostMapping("/users")
            public Users saveUser(@RequestBody Users user) {
            return service.saveUser(user);
    }
}
