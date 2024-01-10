package com.weather.openweatherreport.mvvm.module

import com.weather.openweatherreport.mvvm.repository.WeatherRepository
import com.weather.openweatherreport.mvvm.repository.WeatherRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface RepositoriesModule {

    @Binds
    fun weatherRepository(weatherRepositoryImpl: WeatherRepositoryImpl) : WeatherRepository
}