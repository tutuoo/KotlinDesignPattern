package com.build.tutu.DesignPattern.TacticsPattern.Object_class.base

import com.build.tutu.DesignPattern.TacticsPattern.Interface.base_behavior.FlyBehavior
import com.build.tutu.DesignPattern.TacticsPattern.Interface.base_behavior.QuackBehavior

/**
 * 可以把每组行为管理 看做一组同类型的算法
 * 用行为的超父类(抽象类、或者接口）来统一管理行为
 * 比方下面用「叫」「飞」来管理具体怎么叫、具体怎么飞
 * 以后如果增加了「跑」就可以定义行为管理
 */
abstract class Duck {

    /**
     * 初始化行为管理
     */
    var quackBehavior: QuackBehavior = object : QuackBehavior {}
    var flyBehavior: FlyBehavior = object : FlyBehavior {}

    /**
     * 叫声 行为管理
     */
    fun performQuack() {
        quackBehavior.quack()
    }

    /**
     * 飞行 行为管理
     */
    fun performFly() {
        flyBehavior.fly()
    }

    /**
     *  Duck 都会游泳
     */
    fun swim() {
        println("我会游泳")
    }

    /**
     * 每个 Duck 都有的不同表现
     */
    abstract fun display()
}