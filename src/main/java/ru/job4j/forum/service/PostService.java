package ru.job4j.forum.service;

import org.springframework.stereotype.Service;
import ru.job4j.forum.model.Post;
import ru.job4j.forum.repository.PostRepository;

import java.util.*;

@Service
public class PostService {

    private final PostRepository posts;

    public PostService(PostRepository posts) {
        this.posts = posts;
    }

    public List<Post> getAll() {
        List<Post> rsl = new ArrayList<>();
        posts.findAll().forEach(rsl::add);
        return rsl;
    }

    public Post save(Post post) {
        post.setCreated(new Date(System.currentTimeMillis()));
        return posts.save(post);
    }

    public Post findPostById(long id) {
        Post post = posts.findById(id).get();
        return post;
    }
}
