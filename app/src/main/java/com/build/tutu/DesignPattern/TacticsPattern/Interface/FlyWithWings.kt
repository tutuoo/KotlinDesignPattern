package com.build.tutu.DesignPattern.TacticsPattern.Interface

import com.build.tutu.DesignPattern.TacticsPattern.Interface.base_behavior.FlyBehavior

/**
 * 具体行为飞
 */
class FlyWithWings : FlyBehavior {

    override fun fly() {
        println("这货会 -> 飞飞飞")
    }
}