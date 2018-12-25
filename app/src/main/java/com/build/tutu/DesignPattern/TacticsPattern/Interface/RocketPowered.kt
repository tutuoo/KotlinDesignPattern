package com.build.tutu.DesignPattern.TacticsPattern.Interface

import com.build.tutu.DesignPattern.TacticsPattern.Interface.base_behavior.FlyBehavior

class RocketPowered : FlyBehavior {

    override fun fly() {
        println("这货 -> 用火箭加速器起飞")
    }

}