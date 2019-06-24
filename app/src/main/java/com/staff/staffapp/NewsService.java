package com.staff.staffapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewsService {

    @GET("api/news")
    Call<List> all();
}
