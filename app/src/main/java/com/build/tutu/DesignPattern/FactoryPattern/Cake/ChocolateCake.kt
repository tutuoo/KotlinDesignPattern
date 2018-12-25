package com.build.tutu.DesignPattern.FactoryPattern.Cake

import com.build.tutu.DesignPattern.FactoryPattern.Cailiao.CakeIngredientFactory
import com.build.tutu.DesignPattern.FactoryPattern.Cake.base.Cake

// 巧克力蛋糕
class ChocolateCake(private var cakeIngredient: CakeIngredientFactory) : Cake() {

    override fun prepare() {
        bread = cakeIngredient.createBread()
        cream = cakeIngredient.createCream()
        name = "ChocolateCake"
        println("name: $name ,bread: $bread ,cream: $cream")
    }

}