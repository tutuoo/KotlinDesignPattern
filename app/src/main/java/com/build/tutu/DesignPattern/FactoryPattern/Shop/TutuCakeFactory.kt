package com.build.tutu.DesignPattern.FactoryPattern.Shop

import com.build.tutu.DesignPattern.FactoryPattern.Cailiao.CakeIngredientFactory
import com.build.tutu.DesignPattern.FactoryPattern.Cailiao.Factory
import com.build.tutu.DesignPattern.FactoryPattern.Cailiao.TutuCailiaoFactory2
import com.build.tutu.DesignPattern.FactoryPattern.Cake.CoffeeCake
import com.build.tutu.DesignPattern.FactoryPattern.Cake.TutuCake
import com.build.tutu.DesignPattern.FactoryPattern.Cake.base.Cake

// 工厂2
class TutuCakeFactory : Factory<CakeIngredientFactory> {

    override fun createCake(str: String): Cake? {

        var cake: Cake? = null
        when (str) {
            //工厂2的材料工厂
            "tutuCake" -> cake = TutuCake(TutuCailiaoFactory2())
            "CoffeeCake" -> cake = CoffeeCake(TutuCailiaoFactory2())
        }
        return cake
    }
}