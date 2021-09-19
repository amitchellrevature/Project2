package com.revature.service;

import com.revature.entity.User;
import com.revature.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }

    @Override
    public User getUserById(long id) {
        Optional<User> user =  repository.findById(id);
        if(user.isEmpty()){
            return null;
        }
        return user.get();
    }

    @Override
    public User login(String username, String password) {
        List<User> users = repository.findAll();
        for (User user: repository.findAll()) {
            if (user.getUsername().equals(username))
                if(user.getPassword().equals(password))
                    return user;
        }
        return null;
    }
}
