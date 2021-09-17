package com.revature.Project2.service;


import com.revature.Project2.entity.Users;
import org.springframework.stereotype.Service;

@Service
public interface UsersService {
    Users saveUser(Users user);
    Users updateUser(long id, Users users);

}
