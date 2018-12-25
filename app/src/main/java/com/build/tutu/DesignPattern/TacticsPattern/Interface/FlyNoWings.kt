package com.build.tutu.DesignPattern.TacticsPattern.Interface

import com.build.tutu.DesignPattern.TacticsPattern.Interface.base_behavior.FlyBehavior

/**
 * 具体行为 不会飞
 */
class FlyNoWings : FlyBehavior {

    override fun fly() {
        println("这货 -> 不会飞哈")
    }

}