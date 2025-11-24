package com.moviereview.moviereviewapp.model;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import com.moviereview.moviereviewapp.R;
import com.moviereview.moviereviewapp.service.MovieRetrofitInstance;
import com.moviereview.moviereviewapp.service.MovieServiceData;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieRepository {

    private ArrayList<Movie> movieArrayList = new ArrayList<>();
    private MutableLiveData<List<Movie>> mutableLiveData = new MutableLiveData<>();
    private Application application;


    public MovieRepository(Application application) {
        this.application = application;
    }


    public MutableLiveData<List<Movie>> getPopularMovies(){

        MovieServiceData movieServiceData = MovieRetrofitInstance.getInstances();
        Call<Result> call = movieServiceData.getAllPopularMovie(application.getApplicationContext().getString(R.string.apiKey));



        call.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                Result result = response.body();

                if (result != null && result.getResults() != null){

                    movieArrayList = (ArrayList<Movie>) result.getResults();

                    mutableLiveData.setValue(movieArrayList);
                }
            }

            @Override
            public void onFailure(Call<Result> call, Throwable throwable) {

            }
        });


        return mutableLiveData;
    }

}
