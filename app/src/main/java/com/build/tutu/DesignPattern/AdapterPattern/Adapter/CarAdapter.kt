package com.build.tutu.DesignPattern.AdapterPattern.Adapter

import com.build.tutu.DesignPattern.AdapterPattern.Interface.Airplane
import com.build.tutu.DesignPattern.AdapterPattern.Interface.Car

class CarAdapter(var car: Car) : Airplane {

    override fun addOil() {
        car.addOil()
    }

    override fun run() {
        car.run()
    }
}