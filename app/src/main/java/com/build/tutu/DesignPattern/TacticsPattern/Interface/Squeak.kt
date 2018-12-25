package com.build.tutu.DesignPattern.TacticsPattern.Interface

import com.build.tutu.DesignPattern.TacticsPattern.Interface.base_behavior.QuackBehavior

/**
 * 具体叫声 老鼠 🐭 吱吱吱
 */
class Squeak : QuackBehavior {

    override fun quack() {
        println("吱吱吱")
    }

}