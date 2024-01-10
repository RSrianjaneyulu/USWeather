package com.weather.openweatherreport.mvvm.repository

import com.weather.openweatherreport.mvvm.model.CommonWeather
import retrofit2.Response
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(private val weatherApi: WeatherApi): WeatherRepository {
    override suspend fun getWeatherReport(city: String, appid: String) = weatherApi.getWeatherReport(city, appid)


}