package com.nandan.retrofitinspringboot.controller;

import com.nandan.retrofitinspringboot.model.Post;
import com.nandan.retrofitinspringboot.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/retrofit")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> fetchPosts(){
        return postService.fetchPosts();
    }

}
