package com.sathish.service;

import com.sathish.model.Credential;
import com.sathish.model.User;

import java.util.List;

public interface UserService {

    User save(User user);
    List<User> findAll();

    User login(Credential credential);
}
