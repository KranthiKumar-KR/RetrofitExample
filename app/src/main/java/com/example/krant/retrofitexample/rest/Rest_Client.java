package com.example.krant.retrofitexample.rest;

import com.example.krant.retrofitexample.util.Contents;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by krant on 3/26/2017.
 */

public class Rest_Client {
    private API_Service api_service;

    public Rest_Client() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Contents.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api_service = retrofit.create(API_Service.class);

    }
    public API_Service getApi_service(){
        return api_service;
    }
}
