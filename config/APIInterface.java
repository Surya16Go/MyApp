package com.mydfmax.test.config;

import retrofit2.http.POST;
import retrofit2.http.Body;

public interface APIInterface {
    @POST("/api/auth/login")
    Call<LoginResponse> login(@Body LoginRequest loginRequest);
}
