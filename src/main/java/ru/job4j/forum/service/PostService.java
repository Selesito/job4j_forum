package ru.job4j.forum.service;

import org.springframework.stereotype.Service;
import ru.job4j.forum.model.Post;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class PostService {
    private static final AtomicInteger ID = new AtomicInteger(0);
    private final Map<Integer, Post> posts = new HashMap<>();

    public PostService() {
        Post post = Post.of("Обновление job4j");
        post.setId(ID.incrementAndGet());
        post.setCreated(new Date(System.currentTimeMillis()));
        post.setDesc("Как вам нововедение?");
        posts.put(post.getId(), post);
    }

    public List<Post> getAll() {
        return new ArrayList<>(posts.values());
    }

    public Post save(Post post) {
        post.setCreated(new Date(System.currentTimeMillis()));
        if (post.getId() == 0) {
            post.setId(ID.incrementAndGet());
            return posts.put(post.getId(), post);
        } else {
            return posts.put(post.getId(), post);
        }
    }

    public Post findPostById(int id) {
        return posts.get(id);
    }
}
