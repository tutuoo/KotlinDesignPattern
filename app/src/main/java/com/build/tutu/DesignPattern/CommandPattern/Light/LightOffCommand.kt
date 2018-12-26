package com.build.tutu.DesignPattern.CommandPattern.Light

import com.build.tutu.DesignPattern.CommandPattern.Command.Command

/**
 * 灯被关了
 */
class LightOffCommand(var light: Light) : Command {

    override fun undo() {
        light.high()
    }

    override fun execute() {
        light.off()
    }

}