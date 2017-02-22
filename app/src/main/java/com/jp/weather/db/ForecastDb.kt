package com.jp.weather.db

class ForecastDb(
        val forecastDbHelper: ForecastDbHelper = ForecastDbHelper.instance,
        val dataMapper: DbDataMapper = DbDataMapper())

fun requestForecastByZipCode(zipCode: Long, date: Long) = forecastDbHelper.use {
}
}