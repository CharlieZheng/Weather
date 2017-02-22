package com.jp.weather.domain

data class ForecastList(val city: String, val country: String,
                        val dailyForecast: List<Forecast>)