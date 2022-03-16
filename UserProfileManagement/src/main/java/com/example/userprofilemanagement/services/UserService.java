package com.example.userprofilemanagement.services;

import com.example.userprofilemanagement.entities.User;

import java.util.List;

public interface UserService {

    List<User>getAllUser();
    User getUserById(Long id);
    User saveUser(User user);
    User updateUser(User user);
    void deleteUserById(Long id);
}
