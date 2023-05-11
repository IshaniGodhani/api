package com.example.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retro_Instance_Class {
    public static Retrofit_Interface MyAPICalling() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.successoft.in/admin/PHPApi/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        return retrofit.create(Retrofit_Interface.class);
    }
}
