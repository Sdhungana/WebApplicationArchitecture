package com.example.socialmediaapp.service;

import com.example.socialmediaapp.domain.Post;
import com.example.socialmediaapp.domain.PostV2;
import com.example.socialmediaapp.repository.PostRepository;
import com.example.socialmediaapp.repository.PostRepositoryV2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceV2Impl implements PostServiceV2{

   private final PostRepositoryV2 postRepositoryV2;

    public PostServiceV2Impl(PostRepositoryV2 postRepositoryV2) {
        this.postRepositoryV2 = postRepositoryV2;
    }

    @Override
    public List<PostV2> getAll() {
        return postRepositoryV2.getAll();
    }

    @Override
    public Optional<PostV2> getById(int id) {
        return postRepositoryV2.getById(id);
    }

    @Override
    public void createPost(PostV2 post) {
        postRepositoryV2.createPost(post);
    }

    @Override
    public void deletePost(int id) {
        postRepositoryV2.deletePost(id);
    }

    @Override
    public void updatePost(int id, PostV2 post) {
        postRepositoryV2.updatePost(id,post);
    }
}
