package com.build.tutu.DesignPattern.FactoryPattern.Cake.base

// 抽象蛋糕
abstract class Cake {

    lateinit var name: String
    lateinit var bread: String
    lateinit var cream: String

    abstract fun prepare()

    fun bake() {
        println("烘烤")
    }

    fun cut() {
        println("切割")
    }

    fun box() {
        println("装起来")
    }

}