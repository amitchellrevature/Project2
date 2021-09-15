package com.revature.Project2.controller;

import com.revature.Project2.entity.Users;
import com.revature.Project2.repository.UsersRepository;
import com.revature.Project2.service.UsersService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("users")
    public List<Users> getUsers(){
        return this.usersRepository.findAll();
    }
//    @PostMapping("/users")
//            public Users saveUser(@RequestBody Users user) {
//            return service.saveUser(user);
//    }
}
