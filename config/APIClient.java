package com.mydfmax.test.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {
    private static String API_BaseURL = "http://localhost:8080/";
    private static Retrofit retrofit;
    private static Gson gson;

    public static Retrofit getClient() {
        if (retrofit == null) {
            getGson();
            retrofit = new Retrofit.Builder()
                    .baseUrl(API_BaseURL)
                    .addConverterFactory(GsonConverterFactory.create(getGson()))
                    .build();
        }
        return retrofit;
    }

    public static Gson getGson() {
        if (gson == null) {
            gson = new GsonBuilder()
                    .setLenient()
                    .create();
        }
        return gson;
    }
}
