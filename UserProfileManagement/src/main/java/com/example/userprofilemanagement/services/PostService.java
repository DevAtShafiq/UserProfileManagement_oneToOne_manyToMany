package com.example.userprofilemanagement.services;

import com.example.userprofilemanagement.entities.Post;

import java.util.List;

public interface PostService {


    List<Post>getAllPost();
    Post getPostById(Long id);
    Post savePost(Post post);
    Post updatePost(Post post);
    void deletePostById(Long id);

}
