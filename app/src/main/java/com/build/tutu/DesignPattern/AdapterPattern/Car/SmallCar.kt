package com.build.tutu.DesignPattern.AdapterPattern.Car

import com.build.tutu.DesignPattern.AdapterPattern.Interface.Car

class SmallCar : Car {

    override fun run() {
        println("车-----------跑起来了")
    }

    override fun addOil() {
        println("车-----------加油去了")
    }
}