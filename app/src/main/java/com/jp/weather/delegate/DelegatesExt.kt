package com.jp.weather.delegate

import kotlin.properties.ReadWriteProperty

object DelegatesExt {
    fun <T> notNullSingleValue():
            ReadWriteProperty<Any?, T> = NotNullSingleValueVar()
}