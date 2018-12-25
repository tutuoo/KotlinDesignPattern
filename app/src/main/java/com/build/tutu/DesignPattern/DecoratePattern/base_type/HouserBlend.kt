package com.build.tutu.DesignPattern.DecoratePattern.base_type

import com.build.tutu.DesignPattern.DecoratePattern.Beverage

/**
 * 混合咖啡
 */
class HouserBlend() : Beverage() {

    init {
        des = "HouserBlend"
    }

    // 0.99 单价
    override fun cost(): Double {
        return 0.99
    }
}