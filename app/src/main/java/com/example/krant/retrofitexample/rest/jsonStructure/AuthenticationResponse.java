package com.example.krant.retrofitexample.rest.jsonStructure;

/**
 * Created by krant on 3/27/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AuthenticationResponse {


        @SerializedName("data")
        @Expose
        private AuthenticationData data;

        public AuthenticationData getData() {
            return data;
        }

        public void setData(AuthenticationData data) {
            this.data = data;
        }

    }

