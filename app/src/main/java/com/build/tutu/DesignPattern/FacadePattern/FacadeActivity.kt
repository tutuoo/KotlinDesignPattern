package com.build.tutu.DesignPattern.FacadePattern

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.build.tutu.DesignPattern.FacadePattern.bean.Car
import com.build.tutu.DesignPattern.FacadePattern.bean.Door
import com.build.tutu.DesignPattern.FacadePattern.bean.Key
import com.build.tutu.DesignPattern.FacadePattern.bean.Music
import com.build.tutu.DesignPattern.R

/**
 * 外观模式 提供便捷的组合操作
 * 适配器模式和外观模式的区别
 * 外观不只是简化接口,也将客户从组建的子系统中解耦出来了两者都可以包装许多类，
 * 外观的意图是简化接口，而适配器是将接口转换成不同接口。
 */
class FacadeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facade)

        // 故事: 我要开车去买吃的了
        val car = Car()
        val door = Door()
        val key = Key()
        val music = Music()

        door.on()
        key.on()
        music.on()
        car.run()
        println("----到目的地了----")
        car.off()
        music.off()
        key.off()
        door.off()
        println("----买东西去了----")
        println("-------外观模式-------")

        // 外观模式 把具体实现交给这一个对象来完成, has a 的关系, 可以解耦
        val me = GoAnywhereCar(car, door, key, music)
        me.buy()
        println("----买买买----")
        me.goHome()
    }
}
