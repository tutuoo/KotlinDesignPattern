package com.build.tutu.DesignPattern.FactoryPattern.Cake

import com.build.tutu.DesignPattern.FactoryPattern.Cailiao.CakeIngredientFactory
import com.build.tutu.DesignPattern.FactoryPattern.Cake.base.Cake

// tutu 蛋糕
class TutuCake(var cakeIngredient: CakeIngredientFactory) : Cake() {

    override fun prepare() {
        bread = cakeIngredient.createBread()
        cream = cakeIngredient.createCream()
        name = "TutuCake"
        println("name: $name ,bread: $bread ,cream: $cream")
    }

}