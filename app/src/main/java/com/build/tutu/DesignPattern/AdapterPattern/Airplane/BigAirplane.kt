package com.build.tutu.DesignPattern.AdapterPattern.Airplane

import com.build.tutu.DesignPattern.AdapterPattern.Interface.Airplane

class BigAirplane : Airplane {

    override fun run() {
        println("飞机-----------飞起来了")
    }

    override fun addOil() {
        println("飞机-----------去加油了")
    }
}