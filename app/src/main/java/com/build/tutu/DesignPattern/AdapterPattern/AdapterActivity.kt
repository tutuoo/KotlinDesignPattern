package com.build.tutu.DesignPattern.AdapterPattern

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.build.tutu.DesignPattern.AdapterPattern.Adapter.CarAdapter
import com.build.tutu.DesignPattern.AdapterPattern.Airplane.BigAirplane
import com.build.tutu.DesignPattern.AdapterPattern.Car.SmallCar
import com.build.tutu.DesignPattern.AdapterPattern.Interface.Airplane
import com.build.tutu.DesignPattern.R

/**
 * 适配器模式
 * 将一个接口转换成另一个接口 做中间类
 */
class AdapterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adapter)
        val bigAirplane = BigAirplane()
        val smallCar = SmallCar()
        val airplane = CarAdapter(smallCar)
        // 利用适配器 将接口转换成符合要求的接口了
        // 看起来是一俩车,但调用方确认为是符合他要求的飞机.
        airplane.run()
        airplane.addOil()

        println("-------------------")
        testAirplane(bigAirplane)
        println("-------------------")
        testAirplane(airplane)
    }

    private fun testAirplane(airplane: Airplane) {
        println("我认为这是一架飞机!")
        airplane.run()
        airplane.addOil()
    }
}
