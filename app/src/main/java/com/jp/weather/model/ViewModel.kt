package com.jp.weather.model

import kotlin.properties.Delegates

class ViewModel(val db: MyDatabase) {
    var myProperty by Delegates.observable("") {
        d, old, new ->
        db.saveChanges(this, new)
    }
    var positiveNumber = Delegates.vetoable(0) {
        d, old, new ->
        new >= 0
    }
}