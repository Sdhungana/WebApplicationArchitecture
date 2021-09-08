package com.example.socialmediaapp.repository;

import com.example.socialmediaapp.domain.PostV2;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class PostRepositoryV2Impl implements PostRepositoryV2 {

    List<PostV2> posts = new ArrayList<>(Arrays.asList(new PostV2(1, "Learn Spring Boot", "Spring Boot is a light-weight expremely powerful framework", "Joe")));

    @Override
    public List<PostV2> getAll() {
        return posts;
    }

    @Override
    public Optional<PostV2> getById(int id) {
        return posts.stream().filter(p -> p.getId() == id).findFirst();
    }

    @Override
    public void createPost(PostV2 post) {
        post.setId(posts.size() + 1);
        posts.add(post);
    }

    @Override
    public void deletePost(int id) {
        Optional<PostV2> p = posts.stream().filter(post -> post.getId() == id).findFirst();
        if (p.isPresent()) {
            posts.remove(p.get());
        }
    }

    @Override
    public void updatePost(int id, PostV2 post) {
        for (PostV2 p : posts) {
            if (p.getId() == id) {
                p.setTitle(post.getTitle());
                p.setContent(post.getContent());
                p.setAuthor(post.getAuthor());

                break;
            }
        }
    }
}
