package com.build.tutu.DesignPattern.FactoryPattern.Cailiao

// 材料工厂
interface CakeIngredientFactory {

    fun createCream(): String
    fun createBread(): String
}