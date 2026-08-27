package com.project.workshopmongo.services;

import com.project.workshopmongo.domain.User;
import com.project.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    //injecao de dependencia automatica do spring
    @Autowired
    private UserRepository repo;

    public List<User> findAll(){

        return repo.findAll();
    }
}
