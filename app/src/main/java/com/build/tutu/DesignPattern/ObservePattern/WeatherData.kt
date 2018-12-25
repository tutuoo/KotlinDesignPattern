package com.build.tutu.DesignPattern.ObservePattern

import java.util.*

// 被观察者 (被订阅者)
class WeatherData : Observable() {

    var temp: Float = 0f
    var humidity: Float = 0f
    var pressure: Float = 0f

    // 通知观察者获取新数据
    private fun measurementsChanged(arg: Any?) {
        setChanged()
        // 直接推数据
        notifyObservers(this)
    }

    // 模仿数据到来的方法
    fun setDate(temp: Float, humidity: Float, pressure: Float, arg: Any? = null) {
        this.temp = temp
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged(arg)
    }

}