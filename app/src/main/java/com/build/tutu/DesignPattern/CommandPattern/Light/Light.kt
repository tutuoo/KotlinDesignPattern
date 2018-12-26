package com.build.tutu.DesignPattern.CommandPattern.Light

// 被使用者  灯具
class Light {

    companion object {
        const val OFF = 0
        const val HIGH = 1
        const val LOW = 2
    }

    private var light = 0

    fun high() {
        light = HIGH
        println("===============最大亮度")
    }

    fun low() {
        light = LOW
        println("===============最小亮度")
    }

    fun off() {
        light = OFF
        println("===============关闭了")
    }

}