package com.example.socialmediaapp.repository;

import com.example.socialmediaapp.domain.PostV2;

import java.util.List;
import java.util.Optional;

public interface PostRepositoryV2 {
    public List<PostV2> getAll();

    public Optional<PostV2> getById(int id);

    public void createPost(PostV2 post);

    public void deletePost(int id);

    public void updatePost(int id, PostV2 post);
}

