package com.example.userprofilemanagement.services;

import com.example.userprofilemanagement.entities.Post;
import com.example.userprofilemanagement.entities.Profile;

import java.util.List;

public interface ProfileService {

    List<Profile> getAllProfile();
    Profile getProfileById(Long id);
    Profile saveProfile(Profile profile);
    Profile updateProfile (Profile profile);
    void deleteProfileById(Long id);
}
