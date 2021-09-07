package com.example.socialmediaapp.controller;

import com.example.socialmediaapp.domain.Post;
import com.example.socialmediaapp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api/posts")
@RestController
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Post> getById(@PathVariable("id") int id) {
        return postService.getById(id);
    }

    @GetMapping("/hat/{id}")
    public EntityModel<Post> getByIdHat(@PathVariable int id) {
        Optional<Post> post = postService.getById(id);
        EntityModel<Post> resource = EntityModel.of(post.get());
        WebMvcLinkBuilder link1 = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).createPost(new Post()));
        WebMvcLinkBuilder link2 = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).deletePost(id));
        resource.add(link1.withRel("Save-Post"));
        resource.add(link2.withRel("Delete-post"));

        return resource;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public Post createPost(@RequestBody Post post) {
        postService.createPost(post);
        //return new Post();
        return  post;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePost(@PathVariable int id) {
        postService.deletePost(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public void updatePost(@PathVariable int id, @RequestBody Post post) {
        postService.updatePost(id, post);
    }
}
