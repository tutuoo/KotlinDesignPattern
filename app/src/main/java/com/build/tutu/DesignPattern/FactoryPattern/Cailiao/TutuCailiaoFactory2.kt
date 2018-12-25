package com.build.tutu.DesignPattern.FactoryPattern.Cailiao

// 材料2
class TutuCailiaoFactory2 : CakeIngredientFactory {

    override fun createBread(): String {
        return "TutuCailiaoBread2"
    }

    override fun createCream(): String {
        return "TutuCailiaoCream2"
    }

}