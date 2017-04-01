package com.example.krant.retrofitexample.rest.jsonStructure;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Created by krant on 3/27/2017.
 */

public class AuthenticationResponseBody {
    @SerializedName("token")
    @Expose
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
