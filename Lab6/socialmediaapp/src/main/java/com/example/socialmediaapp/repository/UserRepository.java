package com.example.socialmediaapp.repository;

import com.example.socialmediaapp.domain.Post;
import com.example.socialmediaapp.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User,Long> {
    List<User> findAll();
    Optional<User> findById(long id);
    @Query("SELECT u.posts FROM User u WHERE u.id = :id ")
    List<Post> getPostByUserId(@Param("id") long id);

    @Query("SELECT u FROM User u WHERE u.posts.size > 1")
    List<User> getUserWithMoreThanOnePost();


}
