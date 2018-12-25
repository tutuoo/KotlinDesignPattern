package com.build.tutu.DesignPattern.TacticsPattern

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.build.tutu.DesignPattern.R
import com.build.tutu.DesignPattern.TacticsPattern.Interface.*
import com.build.tutu.DesignPattern.TacticsPattern.Object_class.MallardDuck

/**
 * 策略模式 (Strategy Pattern)
 * 可以让算法和使用算法的主体分别独立封装起来,让他们之间可以互相替换.
 */
class TacticsModelActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tactics_model)
        // 构建野鸭对象
        val duck = MallardDuck()
        duck.performQuack()
        duck.performFly()
        duck.display()
        duck.swim()
        println("---------------------------")
        // 重新设置行为方法
        duck.quackBehavior = Quack()
        duck.flyBehavior = FlyWithWings()
        duck.performQuack()
        duck.performFly()
        println("---------------------------")
        // 再次重新设置行为方法
        duck.flyBehavior = RocketPowered()
        duck.performQuack()
        duck.performFly()
        println("---------------------------")
        // 以上的好处是，quack() fly() 行为不直接作用在 duck 上面,而是通过中间类来实现.解耦
        duck.quackBehavior = Squeak()
        duck.flyBehavior = FlyNoWings()
        duck.performQuack()
        duck.performFly()
        println("---------------------------")
    }
}
