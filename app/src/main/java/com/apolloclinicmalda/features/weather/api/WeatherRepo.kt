package com.apolloclinicmalda.features.weather.api

import com.apolloclinicmalda.base.BaseResponse
import com.apolloclinicmalda.features.task.api.TaskApi
import com.apolloclinicmalda.features.task.model.AddTaskInputModel
import com.apolloclinicmalda.features.weather.model.ForeCastAPIResponse
import com.apolloclinicmalda.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}