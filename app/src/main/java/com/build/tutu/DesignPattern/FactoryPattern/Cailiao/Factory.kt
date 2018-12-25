package com.build.tutu.DesignPattern.FactoryPattern.Cailiao

import com.build.tutu.DesignPattern.FactoryPattern.Cake.base.Cake

// Cake 创建接口
interface Factory<T> {

    fun createCake(str: String): Cake?
}