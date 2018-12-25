package com.build.tutu.DesignPattern.DecoratePattern.base_type

import com.build.tutu.DesignPattern.DecoratePattern.Beverage

/**
 * 浓缩咖啡
 */
class Espresso : Beverage() {

    init {
        des = "Espresso"
    }

    // 1.99 单价
    override fun cost(): Double {
        return 1.99
    }
}