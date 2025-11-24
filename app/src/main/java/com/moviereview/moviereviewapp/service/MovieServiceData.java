package com.moviereview.moviereviewapp.service;

import com.moviereview.moviereviewapp.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieServiceData {

    @GET("movie/popular")
    Call<Result> getAllPopularMovie(@Query("api_key") String apiKey);

}
