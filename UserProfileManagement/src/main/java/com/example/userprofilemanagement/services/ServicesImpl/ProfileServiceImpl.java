package com.example.userprofilemanagement.services.ServicesImpl;

import com.example.userprofilemanagement.entities.Post;
import com.example.userprofilemanagement.entities.Profile;
import com.example.userprofilemanagement.entities.User;
import com.example.userprofilemanagement.repositories.PostRepository;
import com.example.userprofilemanagement.repositories.ProfileRepository;
import com.example.userprofilemanagement.repositories.UserRepository;
import com.example.userprofilemanagement.services.ProfileService;
import org.springframework.stereotype.Service;

import  org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class ProfileServiceImpl  implements ProfileService {

    @Autowired
    private ProfileRepository profileRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostRepository postRepository;



    //userRepository
    public User ProfileGetUserById(Long id) {
        return userRepository.findById(id).get();
    }

//postRepository

    public Post ProfileGetPostById(Long id){

        return postRepository.findById(id).get();
    }


    @Override
    public List<Profile> getAllProfile() {
        return profileRepository.findAll();
    }

    @Override
    public Profile getProfileById(Long id) {
        return profileRepository.findById(id).get();
    }

    @Override
    public Profile saveProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    public Profile updateProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    public void deleteProfileById(Long id) {

        profileRepository.deleteById(id);
    }
}
