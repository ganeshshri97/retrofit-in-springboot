package com.nandan.retrofitinspringboot.service;

import com.nandan.retrofitinspringboot.model.Post;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface PostApi {

    @GET("/posts")
    public Call<List<Post>> fetchPosts();
}
