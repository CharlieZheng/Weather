package com.jp.weather.domain

data class Forecast(val date: String, val description: String, val high: Int,
                    val low: Int)