package com.JwtExample.Service;


import com.JwtExample.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User>store  = new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Durgesh","durgesh@dev.in"));
        store.add(new User(UUID.randomUUID().toString(),"Hasrsh","harsh@dev.in"));
        store.add(new User(UUID.randomUUID().toString(),"Ankit","ankit@dev.in"));
        store.add(new User(UUID.randomUUID().toString(),"Gautam","gautam@dev.in"));
    }

    public List<User> getUsers(){
        return store;
    }
}
