package com.example.socialmediaapp.repository;

import com.example.socialmediaapp.domain.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends CrudRepository<Post,Long> {
    public List<Post> findAll();
    public Optional<Post> findById(long id);
}

