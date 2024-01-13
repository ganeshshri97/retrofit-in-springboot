package com.nandan.retrofitinspringboot.service;

import com.nandan.retrofitinspringboot.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {

    public List<Post> fetchPosts();
}
