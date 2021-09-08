package com.example.socialmediaapp.service;

import com.example.socialmediaapp.domain.Post;
import java.util.List;
import java.util.Optional;

public interface PostService {
    public List<Post> getAll();
    public Optional<Post> getById(long id);
    public void createPost(Post post);
    public void deletePost(long id);
    public  void updatePost(long id, Post post);
}
