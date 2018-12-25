package com.build.tutu.DesignPattern.FactoryPattern.Shop

import com.build.tutu.DesignPattern.FactoryPattern.Cailiao.CakeIngredientFactory
import com.build.tutu.DesignPattern.FactoryPattern.Cailiao.Factory
import com.build.tutu.DesignPattern.FactoryPattern.Cailiao.SimpleCailiaoFactory1
import com.build.tutu.DesignPattern.FactoryPattern.Cake.ChocolateCake
import com.build.tutu.DesignPattern.FactoryPattern.Cake.StrawberryCake
import com.build.tutu.DesignPattern.FactoryPattern.Cake.base.Cake

// 工厂1
class SimpleCakeFactory : Factory<CakeIngredientFactory> {

    override fun createCake(str: String): Cake? {

        var cake: Cake? = null
        when (str) {
            //工厂1的材料工厂
            "Chocolate" -> cake = ChocolateCake(SimpleCailiaoFactory1())
            "Strawberry" -> cake = StrawberryCake(SimpleCailiaoFactory1())
        }
        return cake
    }
}