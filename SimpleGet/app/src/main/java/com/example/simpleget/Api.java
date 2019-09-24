package com.example.simpleget;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String Base_Url = "https://jsonplaceholder.typicode.com/";

    @GET("todos/1")
    Call<id> getdata();

}
