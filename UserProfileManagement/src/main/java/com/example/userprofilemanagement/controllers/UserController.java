package com.example.userprofilemanagement.controllers;


import com.example.userprofilemanagement.entities.Profile;
import com.example.userprofilemanagement.entities.User;
import com.example.userprofilemanagement.services.ProfileService;
import com.example.userprofilemanagement.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.xml.transform.OutputKeys;

@Controller
public class UserController {


    @Autowired
    UserService userService;
    @Autowired
    ProfileService profileService;


    @PostMapping("/api/user")
    public User saveUser(@RequestBody User user) {

        return userService.saveUser(user);
    }

 @PostMapping("/api/profile")
    public Profile saveUser(@RequestBody Profile profile) {

     return profileService.saveProfile(profile);

    }

}
