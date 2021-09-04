package com.example.socialmediaapp.repository;

import com.example.socialmediaapp.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class PostRepositoryImpl implements PostRepository {

    List<Post>posts = new ArrayList<>(Arrays.asList(new Post(1,"Learn Spring Boot","Spring Boot is a light-weight expremely powerful framework","Joe"),new Post(2,"Machine Learning with Python","Python  has many inbuilt libraries for machine learning","Sam")));
    @Override
    public List<Post> getAll() {
        return posts;
    }

    @Override
    public Optional<Post> getById(int id) {
        return posts.stream().filter(p -> p.getId() == id).findFirst();
    }
}
