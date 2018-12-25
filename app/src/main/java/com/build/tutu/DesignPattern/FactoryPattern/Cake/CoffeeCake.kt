package com.build.tutu.DesignPattern.FactoryPattern.Cake

import com.build.tutu.DesignPattern.FactoryPattern.Cailiao.CakeIngredientFactory
import com.build.tutu.DesignPattern.FactoryPattern.Cake.base.Cake

// 咖啡蛋糕
class CoffeeCake(var cakeIngredient: CakeIngredientFactory) : Cake() {

    override fun prepare() {
        bread = cakeIngredient.createBread()
        cream = cakeIngredient.createCream()
        name = "CoffeeCake"
        println("name: $name ,bread: $bread ,cream: $cream")
    }
}