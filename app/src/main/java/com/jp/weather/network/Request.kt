package com.jp.weather.network

import android.util.Log
import java.net.URL

class Request(val url: String) {
    fun run() {

        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}