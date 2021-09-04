package com.example.socialmediaapp.controller;

import com.example.socialmediaapp.domain.Post;
import com.example.socialmediaapp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequestMapping("/posts")
@RestController
public class PostController {

    @Autowired
    PostService postService;
    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Post> getById(@PathVariable("id") int id) {
        return postService.getById(id);
    }
}
