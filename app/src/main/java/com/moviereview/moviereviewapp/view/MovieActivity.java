package com.moviereview.moviereviewapp.view;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.moviereview.moviereviewapp.R;
import com.moviereview.moviereviewapp.databinding.ActivityMovieBinding;
import com.moviereview.moviereviewapp.model.Movie;

public class MovieActivity extends AppCompatActivity {

    private Movie movie;
    private ActivityMovieBinding activityMovieBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_movie);

        activityMovieBinding = DataBindingUtil.setContentView(this, R.layout.activity_movie);


        Intent intent = getIntent();

        if (intent != null){

            movie = getIntent().getParcelableExtra("movie");

            activityMovieBinding.setMovie(movie);

        }


    }
}