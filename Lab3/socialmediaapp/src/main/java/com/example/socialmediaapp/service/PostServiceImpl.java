package com.example.socialmediaapp.service;

import com.example.socialmediaapp.domain.Post;
import com.example.socialmediaapp.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
   PostRepository postRepository;
    @Override
    public List<Post> getAll() {
        return postRepository.getAll();
    }

    @Override
    public Optional<Post> getById(int id) {
        return postRepository.getById(id);
    }
}
