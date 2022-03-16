package com.example.userprofilemanagement;

import com.example.userprofilemanagement.entities.Post;
import com.example.userprofilemanagement.entities.Profile;
import com.example.userprofilemanagement.entities.User;
import com.example.userprofilemanagement.repositories.PostRepository;
import com.example.userprofilemanagement.repositories.ProfileRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
@SpringBootApplication
public class UserProfileManagementApplication   {

    public static void main(String[] args) {
        SpringApplication.run(UserProfileManagementApplication.class, args);
    }





}
