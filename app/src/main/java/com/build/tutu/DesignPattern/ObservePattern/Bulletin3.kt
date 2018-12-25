package com.build.tutu.DesignPattern.ObservePattern

import android.util.Log
import com.build.tutu.DesignPattern.ObservePattern.Interface.DisplayElement
import java.util.*

class Bulletin3(private var observable: Observable) : Observer, DisplayElement {

    init {
        registerObserver()
        println("公告栏3被注册")
    }

    private var temp: Float = 0f
    private var humidity: Float = 0f
    private var pressure: Float = 0f

    override fun update(obs: Observable, arg: Any?) {
        val weatherData = obs as WeatherData
        this.temp = weatherData.temp
        this.humidity = weatherData.humidity
        this.pressure = weatherData.pressure
        display()
    }

    override fun display() {
        Log.i("公告栏3", "temp: $temp , humidity: $humidity , pressure: $humidity")
        println("---------------------------------------------------------------------------")
    }

    private fun registerObserver() {
        observable.addObserver(this)
    }

    fun removeObserver() {
        observable.deleteObserver(this)
    }
}