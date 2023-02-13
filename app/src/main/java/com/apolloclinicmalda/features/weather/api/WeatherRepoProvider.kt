package com.apolloclinicmalda.features.weather.api

import com.apolloclinicmalda.features.task.api.TaskApi
import com.apolloclinicmalda.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}