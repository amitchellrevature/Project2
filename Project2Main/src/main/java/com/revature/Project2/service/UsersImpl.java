package com.revature.Project2.service;


import com.revature.Project2.entity.Users;
import com.revature.Project2.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersImpl implements  UsersService{

    @Autowired
private UsersRepository repository;


    @Override
    public Users saveUser(Users user) {

        return repository.save(user);
    }

    @Override
    public Users updateUser(long id, Users users) {
        return null;
    }
}
