package com.example.userprofilemanagement.controllers;


import com.example.userprofilemanagement.entities.Post;
import com.example.userprofilemanagement.entities.Profile;
import com.example.userprofilemanagement.entities.User;
import com.example.userprofilemanagement.services.PostService;
import com.example.userprofilemanagement.services.ProfileService;
import com.example.userprofilemanagement.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class UserController {


    @Autowired
    UserService userService;
    @Autowired
    ProfileService profileService;
    @Autowired
    PostService postService;


    @PostMapping("/api/user")
    public User saveUser(@RequestBody User user) {

        return userService.saveUser(user);
    }

 @PostMapping("/api/profile")
    public Profile saveUser(@RequestBody Profile profile) {

     return profileService.saveProfile(profile);

    }

    @PostMapping("/api/post")
    public Post saveUser(@RequestBody Post post) {

     return postService.savePost(post);

    }

@GetMapping("/api/userById/{id}")
public User getUserById(@PathVariable("id") Long id) {


        return userService.getUserById(id);
}
}
