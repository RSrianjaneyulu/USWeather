package com.weather.openweatherreport.mvvm.repository

import com.weather.openweatherreport.mvvm.model.CommonWeather
import retrofit2.Response

interface WeatherRepository {
    suspend fun getWeatherReport(city: String, appid: String) : Response<CommonWeather>
}