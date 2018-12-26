package com.build.tutu.DesignPattern.CommandPattern.Light

import com.build.tutu.DesignPattern.CommandPattern.Command.Command

/**
 * (其实命令这里只应该有两种状态 开和关就够了,具体亮暗应该交给灯自身来控制,我这里添加了3个命令)
 *
 * 灯被调暗了
 */
class LightLowCommand(var light: Light) : Command {

    init {
        println("===============换上了最小亮度")
    }

    override fun execute() {
        light.low()
    }

    override fun undo() {
        light.off()
    }

}