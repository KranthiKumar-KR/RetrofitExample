package com.example.krant.retrofitexample.rest;

import com.example.krant.retrofitexample.activities.MainActivity;
import com.example.krant.retrofitexample.rest.jsonStructure.AuthenticationResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by krant on 3/26/2017.
 */

interface API_Service {
    @POST("register")
    Call<AuthenticationResponse> registerUser(@Body MainActivity.RegisterRequest registerRequest);
}
