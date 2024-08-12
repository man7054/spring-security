package com.Learnpring.springJwt.service;

import com.Learnpring.springJwt.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store=new ArrayList<>();

    public UserService() {

    }
    public List<User> getUser(){
        return this.store;
    }
}
