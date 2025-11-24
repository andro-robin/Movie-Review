package com.moviereview.moviereviewapp.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.moviereview.moviereviewapp.model.Movie;
import com.moviereview.moviereviewapp.model.MovieRepository;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    private MovieRepository movieRepository;
    private LiveData<List<Movie>> movieLiveData;


    public MainActivityViewModel(@NonNull Application application) {
        super(application);

        movieRepository = new MovieRepository(application);
    }


    public LiveData<List<Movie>> getMovieLiveData(){
        return movieRepository.getPopularMovies();
    }
}
