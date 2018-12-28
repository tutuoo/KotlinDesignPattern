package com.build.tutu.DesignPattern.FacadePattern

import com.build.tutu.DesignPattern.FacadePattern.bean.Car
import com.build.tutu.DesignPattern.FacadePattern.bean.Door
import com.build.tutu.DesignPattern.FacadePattern.bean.Key
import com.build.tutu.DesignPattern.FacadePattern.bean.Music

class GoAnywhereCar(var car: Car, var door: Door, var key: Key, var music: Music) {

    fun buy() {
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
    }

    fun goHome(){
        door.on()
        key.on()
        music.on()
        car.run()
        println("----回家了----")
        car.off()
        music.off()
        key.off()
        door.off()
        println("----LOL----")
    }

}