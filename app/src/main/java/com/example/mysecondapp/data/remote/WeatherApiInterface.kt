package com.example.mysecondapp.data.remote

import com.example.mysecondapp.data.remote.model.WeatherApiModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface WeatherApiInterface {

    @GET("onecall")
    suspend fun getWeather(@QueryMap params: Map<String, String>): Response<WeatherApiModel>
//    suspend fun getWeather(@QueryMap params: Map<String, String>): Response<List<CatFact>>


}