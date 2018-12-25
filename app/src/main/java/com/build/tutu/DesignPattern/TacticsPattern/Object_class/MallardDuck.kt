package com.build.tutu.DesignPattern.TacticsPattern.Object_class

import com.build.tutu.DesignPattern.TacticsPattern.Object_class.base.Duck

/**
 * 具体实现 野鸭
 */
class MallardDuck : Duck() {

    override fun display() {
        println("我是: MallardDuck")
    }

}