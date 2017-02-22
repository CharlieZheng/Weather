package com.jp.weather.domain

interface Command<T> {
    fun execute(): T
}