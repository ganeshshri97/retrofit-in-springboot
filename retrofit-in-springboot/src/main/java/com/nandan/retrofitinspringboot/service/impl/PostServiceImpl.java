package com.nandan.retrofitinspringboot.service.impl;

import com.nandan.retrofitinspringboot.model.Post;
import com.nandan.retrofitinspringboot.service.PostApi;
import com.nandan.retrofitinspringboot.service.PostService;
import com.nandan.retrofitinspringboot.util.RetroFitUtil;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class PostServiceImpl implements PostService {

    // Using these are needed to call and fetch details from API.
    private Retrofit retrofit;
    private PostApi postApi;

    PostServiceImpl(){
        retrofit = RetroFitUtil.getRetrofitInstance();
        postApi = retrofit.create(PostApi.class);
    }

    @Override
    public List<Post> fetchPosts() {

        List<Post> listOfPostsResponse = new ArrayList<>(); // This will store the all posts data from API.

        Call<List<Post>> fetchPostCall = postApi.fetchPosts(); // Here we have API call but don't have actual fetched data.
        System.out.println("fetchPostCall : "+fetchPostCall);

        try {
            Response<List<Post>> apiResponse = fetchPostCall.execute();  // It has actual response data from API
            System.out.println("apiResponse: "+apiResponse);

            if(apiResponse.isSuccessful() && apiResponse.body() != null){
                listOfPostsResponse = apiResponse.body();      // Passing response data into list
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return listOfPostsResponse;
    }
}

