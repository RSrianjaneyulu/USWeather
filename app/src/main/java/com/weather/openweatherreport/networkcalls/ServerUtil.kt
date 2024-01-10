package com.weather.openweatherreport.networkcalls

class ServerUtil {
    companion object {
        val serverBaseUrl = "https://api.openweathermap.org/"
        val getWeatherDetailsURL = serverBaseUrl + "data/2.5/"
        val weatherImageURL = "http://openweathermap.org/"
    }
}