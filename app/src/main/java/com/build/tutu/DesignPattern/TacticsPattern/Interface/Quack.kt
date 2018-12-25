package com.build.tutu.DesignPattern.TacticsPattern.Interface

import com.build.tutu.DesignPattern.TacticsPattern.Interface.base_behavior.QuackBehavior

/**
 * 具体行为 鸭叫声
 */
class Quack : QuackBehavior {

    override fun quack() {
        println("嘎嘎嘎")
    }
}