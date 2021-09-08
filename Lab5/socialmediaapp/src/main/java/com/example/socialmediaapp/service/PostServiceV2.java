package com.example.socialmediaapp.service;

import com.example.socialmediaapp.domain.PostV2;

import java.util.List;
import java.util.Optional;

public interface PostServiceV2 {
    public List<PostV2> getAll();
    public Optional<PostV2> getById(long id);
    public void createPost(PostV2 post);
    public void deletePost(long id);
    public  void updatePost(long id, PostV2 post);
}
