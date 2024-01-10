package com.weather.openweatherreport.mvvm.repository

import com.weather.openweatherreport.mvvm.model.CommonWeather
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("weather?")
    suspend fun getWeatherReport(@Query("q") q : String, @Query("appid") appid : String): Response<CommonWeather>
}