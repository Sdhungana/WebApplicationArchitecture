package com.example.socialmediaapp.repository;


import com.example.socialmediaapp.domain.PostV2;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepositoryV2 extends CrudRepository<PostV2, Long> {
    List<PostV2> findAll();

    Optional<PostV2> findById(long id);
}

