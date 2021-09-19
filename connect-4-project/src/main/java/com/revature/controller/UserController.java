package com.revature.controller;

import com.revature.entity.User;
import com.revature.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        return service.saveUser(user);
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") long id) {
        return service.getUserById(id);
    }

    @GetMapping("/user/{username}/{password}")
    public User login(@PathVariable("username") String username, @PathVariable("password") String password) {
        return service.login(username, password);
    }
}
