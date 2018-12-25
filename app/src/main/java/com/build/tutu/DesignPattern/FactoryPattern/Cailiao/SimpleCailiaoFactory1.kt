package com.build.tutu.DesignPattern.FactoryPattern.Cailiao

// 材料1
class SimpleCailiaoFactory1 : CakeIngredientFactory {

    override fun createBread(): String {
        return "SimpleCailiaoBread"
    }

    override fun createCream(): String {
        return "SimpleCailiaoCream"
    }

}