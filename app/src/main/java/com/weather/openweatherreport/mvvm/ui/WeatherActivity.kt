package com.weather.openweatherreport.mvvm.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.weather.openweatherreport.databinding.ActivityWeatherBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WeatherActivity: AppCompatActivity() {

    lateinit var binding: ActivityWeatherBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeatherBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}