package com.example.socialmediaapp.service;


import com.example.socialmediaapp.domain.PostV2;

import com.example.socialmediaapp.repository.PostRepositoryV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PostServiceV2Impl implements PostServiceV2 {

    private final PostRepositoryV2 postRepositoryV2;

    @Autowired
    public PostServiceV2Impl(PostRepositoryV2 postRepositoryV2) {
        this.postRepositoryV2 = postRepositoryV2;
    }

    @Override
    public List<PostV2> getAll() {
        return postRepositoryV2.findAll();
    }

    @Override
    public Optional<PostV2> getById(long id) {
        return postRepositoryV2.findById(id);
    }


}
