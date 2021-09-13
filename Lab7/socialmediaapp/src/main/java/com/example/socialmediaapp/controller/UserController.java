package com.example.socialmediaapp.controller;

import com.example.socialmediaapp.domain.Post;
import com.example.socialmediaapp.domain.User;
import com.example.socialmediaapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> findAllUser() {
        return userService.findAllUser();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public Optional<User> findById(@PathVariable long id) {
        return userService.findById(id);
    }

    @PostMapping
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }

    @GetMapping("/{id}/posts")
    public List<Post> getPostByUserId(@PathVariable long id) {
        return userService.getPostByUserId(id);
    }

    @GetMapping("/userWithMoreThanOnePost")
    public List<User> getUserWithMoreThanOnePost() {
        return userService.getUserWithMoreThanOnePost();
    }
}
