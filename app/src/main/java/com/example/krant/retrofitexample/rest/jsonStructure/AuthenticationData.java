package com.example.krant.retrofitexample.rest.jsonStructure;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by krant on 3/27/2017.
 */

public class AuthenticationData {
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("body")
    @Expose
    private AuthenticationResponseBody body;
    @SerializedName("code")
    @Expose
    private Integer code;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AuthenticationResponseBody getBody() {
        return body;
    }

    public void setBody(AuthenticationResponseBody body) {
        this.body = body;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
