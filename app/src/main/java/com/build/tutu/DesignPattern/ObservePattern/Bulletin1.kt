package com.build.tutu.DesignPattern.ObservePattern

import android.util.Log
import com.build.tutu.DesignPattern.ObservePattern.Interface.DisplayElement
import java.util.*

class Bulletin1(private var observable: Observable) : Observer, DisplayElement {

    // 初始化操作
    init {
        registerObserver()
        println("公告栏1被注册")
    }

    private var temp: Float = 0f
    private var humidity: Float = 0f
    private var pressure: Float = 0f

    // 更新数据
    override fun update(obs: Observable, arg: Any?) {
        // 用于 arg 不为空的一些操作 // 相当于直接推数据
        arg?.let {
            val observable1 = it as WeatherData
            println("公告栏1 ary 不为空 : ${observable1.temp}")
        }
        // 这里相当于自己拿数据
        val weatherData = obs as WeatherData
        this.temp = weatherData.temp
        this.humidity = weatherData.humidity
        this.pressure = weatherData.pressure
        display()
    }

    // 展示数据
    override fun display() {
        Log.i("公告栏1", "temp: $temp , humidity: $humidity , pressure: $humidity")
        println("---------------------------------------------------------------------------")
    }

    // 注册自身成为观察者
    private fun registerObserver() {
        observable.addObserver(this)
    }

    // 删除观察者
    private fun removeObserver() {
        observable.deleteObserver(this)
    }
}