package com.nandan.retrofitinspringboot.util;

import com.nandan.retrofitinspringboot.constant.RetrofitConstant;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitUtil {

    private static Retrofit retrofit = null;

    public static Retrofit getRetrofitInstance(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(RetrofitConstant.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())   // GSon will helps to convert response into Json
                    .build();
        }
        return retrofit;
    }
}
