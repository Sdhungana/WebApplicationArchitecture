package com.example.socialmediaapp.repository;

import com.example.socialmediaapp.domain.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository {
    public List<Post> getAll();

    public Optional<Post> getById(int id);
}

