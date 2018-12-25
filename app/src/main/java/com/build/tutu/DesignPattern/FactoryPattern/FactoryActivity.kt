package com.build.tutu.DesignPattern.FactoryPattern

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.build.tutu.DesignPattern.FactoryPattern.Shop.CakeShop
import com.build.tutu.DesignPattern.FactoryPattern.Shop.SimpleCakeFactory
import com.build.tutu.DesignPattern.FactoryPattern.Shop.TutuCakeFactory
import com.build.tutu.DesignPattern.R

class FactoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factory)

        // 不同店给不同工厂和原料工厂 —— 这样可以用不同地方的材料做出不同口味的蛋糕
        // 这里的蛋糕可以定义常量/枚举 这样不容易写错.

        val simpleShop = CakeShop(cakeFactory = SimpleCakeFactory())
        val chocolate = simpleShop.orderCake(com.build.tutu.DesignPattern.FactoryPattern.CakeEnum.Chocolate.name)
        println("Chocolate name: ${chocolate?.name}")
        val strawberry = simpleShop.orderCake(com.build.tutu.DesignPattern.FactoryPattern.CakeEnum.Strawberry.name)
        println("Strawberry name: ${strawberry?.name}")

        println("----------------------------------------")

        val tutushop = CakeShop(cakeFactory = TutuCakeFactory())
        val tutuCake = tutushop.orderCake("tutuCake")
        println("tutuCake name: ${tutuCake?.name}")
        val coffeeCake = tutushop.orderCake("CoffeeCake")
        println("CoffeeCake name: ${coffeeCake?.name}")

    }
}