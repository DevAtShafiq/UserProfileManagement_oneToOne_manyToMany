package com.example.userprofilemanagement.services.ServicesImpl;

import com.example.userprofilemanagement.entities.Profile;
import com.example.userprofilemanagement.entities.User;
import com.example.userprofilemanagement.repositories.ProfileRepository;
import com.example.userprofilemanagement.repositories.UserRepository;
import com.example.userprofilemanagement.services.PostService;
import com.example.userprofilemanagement.services.ProfileService;
import com.example.userprofilemanagement.services.UserService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public  class UserServiceImpl  implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProfileRepository profileRepository;


    public Profile userGetProfileById(Long id) {
        return profileRepository.findById(id).get();
    }






    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(Long id) {

        userRepository.deleteById(id);
    }




}
