package com.build.tutu.DesignPattern.FacadePattern.bean

import com.build.tutu.DesignPattern.FacadePattern.Interface.Off
import com.build.tutu.DesignPattern.FacadePattern.Interface.On

class Music : On, Off {

    override fun off() {
        println("音乐停了")
    }

    override fun on() {
        println("音乐响了")
    }
}