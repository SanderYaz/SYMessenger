package com.example.symessenger.Fragments;

import com.example.symessenger.Notifications.MyResponse;
import com.example.symessenger.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAVgAx-qw:APA91bFIrSOJBCsQsU-PgKsRaHw-39i_3hcaSoWHBfqHBEqb4DgXi-GiloMwsqhWaoMb3DapgfAzjG07A5GufH2iHARY9kLsX5_YT632vLtG5afa9_0GPjnN1wH6C6FocyulpiIUPuVY"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
