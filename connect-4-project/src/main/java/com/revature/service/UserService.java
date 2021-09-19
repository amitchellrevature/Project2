package com.revature.service;

import com.revature.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User saveUser(User user);
    User getUserById(long id);
    User login(String username, String password);
}
