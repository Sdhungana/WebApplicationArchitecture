package com.example.socialmediaapp.service;

import com.example.socialmediaapp.domain.Post;
import com.example.socialmediaapp.domain.User;
import com.example.socialmediaapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<Post> getPostByUserId(long id) {
        return userRepository.getPostByUserId(id);
    }

    @Override
    public List<User> getUserWithMoreThanOnePost() {
        return userRepository.getUserWithMoreThanOnePost();
    }
}
