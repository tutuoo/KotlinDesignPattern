package com.build.tutu.DesignPattern.FactoryPattern.Cake

import com.build.tutu.DesignPattern.FactoryPattern.Cailiao.CakeIngredientFactory
import com.build.tutu.DesignPattern.FactoryPattern.Cake.base.Cake
// 草莓蛋糕
class StrawberryCake(var cakeIngredient: CakeIngredientFactory) : Cake() {

    override fun prepare() {
        bread = cakeIngredient.createBread()
        cream = cakeIngredient.createCream()
        name = "StrawberryCake"
        println("name: $name ,bread: $bread ,cream: $cream")
    }

}