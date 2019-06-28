package com.staff.staffapp.service;

import com.staff.staffapp.model.LeaveDay;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface LeaveDaysServiceApi {
    @GET("leave/api")
    Call<List<LeaveDay>> getLeaveDays();
}
