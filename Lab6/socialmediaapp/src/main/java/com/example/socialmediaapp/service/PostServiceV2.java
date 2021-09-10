package com.example.socialmediaapp.service;

import com.example.socialmediaapp.domain.PostV2;

import java.util.List;
import java.util.Optional;

public interface PostServiceV2 {
    List<PostV2> getAll();

    Optional<PostV2> getById(long id);

}
