package com.example.userprofilemanagement.services.ServicesImpl;

import com.example.userprofilemanagement.entities.Post;
import com.example.userprofilemanagement.entities.User;
import com.example.userprofilemanagement.repositories.PostRepository;
import com.example.userprofilemanagement.repositories.ProfileRepository;
import com.example.userprofilemanagement.repositories.UserRepository;
import com.example.userprofilemanagement.services.PostService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;
@Autowired
private UserRepository userRepository;


public User PostGetUserById(Long id){

    return userRepository.findById(id).get();
}


    @Override
    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    @Override
    public Post getPostById(Long id) {
        return postRepository.findById(id).get();
    }

    @Override
    public Post savePost(Post post) {
        return postRepository.save(post);
            }

    @Override
    public Post updatePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public void deletePostById(Long id) {
    postRepository.deleteById(id);
    }
}
