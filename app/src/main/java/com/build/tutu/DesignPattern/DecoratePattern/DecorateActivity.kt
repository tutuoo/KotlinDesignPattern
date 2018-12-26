package com.build.tutu.DesignPattern.DecoratePattern

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.build.tutu.DesignPattern.DecoratePattern.base_type.Espresso
import com.build.tutu.DesignPattern.R

/**
 * 装饰模式
 * 层层包装数据
 */
class DecorateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_decorate)

        val espresso = Espresso()
        println("des : ${espresso.des}")
        println("cost : ${espresso.cost()}")
        val mocha = Mocha(espresso)
        println("des : ${mocha.des}")
        println("cost : ${mocha.cost()}")
        val mocha2 = Mocha(mocha)
        println("des : ${mocha2.des}")
        println("cost : ${mocha2.cost()}")

//        System.out: cost : 1.99
//        System.out: des : Mocha Espresso
//        System.out: cost : 2.99
//        System.out: des : Mocha Mocha Espresso
//        System.out: cost : 3.99
    }
}