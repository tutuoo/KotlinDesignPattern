package com.build.tutu.DesignPattern.FactoryPattern.Shop

import com.build.tutu.DesignPattern.FactoryPattern.Cailiao.CakeIngredientFactory
import com.build.tutu.DesignPattern.FactoryPattern.Cailiao.Factory
import com.build.tutu.DesignPattern.FactoryPattern.Cake.base.Cake

// 蛋糕店
class CakeShop(var cakeFactory: Factory<CakeIngredientFactory>) {

    fun orderCake(type: String): Cake? {
        val cake: Cake? = cakeFactory.createCake(type)
        cake?.apply {
            //准备材料
            prepare()
            //固定步骤
            bake()
            cut()
            box()
        }
        return cake
    }
}