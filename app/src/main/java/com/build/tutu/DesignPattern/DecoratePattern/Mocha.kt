package com.build.tutu.DesignPattern.DecoratePattern

class Mocha(var beverage: Beverage) : Beverage() {

    init {
        des = "Mocha ${beverage.des}"
    }

    override fun cost(): Double {
        return 1 + beverage.cost()
    }

}