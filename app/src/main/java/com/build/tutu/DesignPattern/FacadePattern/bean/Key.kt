package com.build.tutu.DesignPattern.FacadePattern.bean

import com.build.tutu.DesignPattern.FacadePattern.Interface.Off
import com.build.tutu.DesignPattern.FacadePattern.Interface.On

class Key : On, Off {

    override fun off() {
        println("钥匙关了")
    }

    override fun on() {
        println("钥匙转了")
    }
}