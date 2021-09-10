package com.example.socialmediaapp.service;


import com.example.socialmediaapp.domain.Post;
import com.example.socialmediaapp.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAllUser();
    Optional<User> findById(long id);
    void createUser(User user);
    List<Post> getPostByUserId(long id);
    List<User> getUserWithMoreThanOnePost();
}
