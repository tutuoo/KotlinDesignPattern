package com.build.tutu.DesignPattern.CommandPattern.Light

import com.build.tutu.DesignPattern.CommandPattern.Command.Command

/**
 * 灯被调最亮了
 */
class LightOnCommand(var light: Light) : Command {

    init {
        println("===============换上了最大亮度")
    }

    override fun execute() {
        light.high()
    }

    override fun undo() {
        light.off()
    }

}