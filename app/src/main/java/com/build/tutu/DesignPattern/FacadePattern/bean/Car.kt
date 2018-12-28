package com.build.tutu.DesignPattern.FacadePattern.bean

import com.build.tutu.DesignPattern.FacadePattern.Interface.Off
import com.build.tutu.DesignPattern.FacadePattern.Interface.Run

class Car : Run, Off {

    override fun off() {
        println("车停下来了")
    }

    override fun run() {
        println("车跑起来了")
    }
}