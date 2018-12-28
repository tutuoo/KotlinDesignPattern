package com.build.tutu.DesignPattern.FacadePattern.bean

import com.build.tutu.DesignPattern.FacadePattern.Interface.Off
import com.build.tutu.DesignPattern.FacadePattern.Interface.On

class Door : On, Off {

    override fun off() {
        println("门关了")
    }

    override fun on() {
        println("门开了")
    }
}