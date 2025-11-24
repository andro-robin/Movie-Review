package com.moviereview.moviereviewapp.model;


import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Result extends BaseObservable implements Parcelable {

    @SerializedName("page")
    @Expose
    private Integer page;

    @SerializedName("results")
    @Expose
    private List<Movie> results;

    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;

    @SerializedName("total_results")
    @Expose
    private Integer totalResults;



    //Parcelable
    public static final Parcelable.Creator<Result> CREATOR = new Creator<Result>() {
        @Override
        public Result createFromParcel(Parcel source) {
            return new Result(source);
        }

        @Override
        public Result[] newArray(int size) {
            return (new Result[size]);
        }
    };



    @Bindable
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
        notifyPropertyChanged(BR.page);
    }

    @Bindable
    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
        notifyPropertyChanged(BR.results);
    }

    @Bindable
    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        notifyPropertyChanged(BR.totalPages);
    }

    @Bindable
    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
        notifyPropertyChanged(BR.totalResults);
    }



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {

        dest.writeValue(page);
        dest.writeValue(results);
        dest.writeValue(totalPages);
        dest.writeValue(totalResults);

    }


    public Result() {
    }

    public Result(Parcel in) {
        this.page = ((Integer) in.readValue(Integer.class.getClassLoader()));
        in.readList(this.results, (com.moviereview.moviereviewapp.model.Movie.class.getClassLoader()));
        this.totalPages = ((Integer) in.readValue(Integer.class.getClassLoader()));
        this.totalResults = ((Integer) in.readValue(Integer.class.getClassLoader()));
    }


}