package com.weather.openweatherreport.mvvm.repository

import com.weather.openweatherreport.mvvm.model.CommonWeather
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CommonWeatherApi {
    @GET("weather?")
    fun getWeatherReport(@Query("q") q : String, @Query("appid") appid : String) : Call<CommonWeather>
}