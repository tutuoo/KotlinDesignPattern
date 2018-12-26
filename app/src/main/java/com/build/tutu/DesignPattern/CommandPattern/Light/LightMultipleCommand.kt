package com.build.tutu.DesignPattern.CommandPattern.Light

import com.build.tutu.DesignPattern.CommandPattern.Command.Command

/**
 * 组合灯
 * 根据传入的命令来搭配执行顺序
 */
class LightMultipleCommand(var command: Array<Command>) : Command {

    init {
        println("===============换上了组合灯")
    }

    override fun execute() {
        command.forEach { it.execute() }
    }

    override fun undo() {
        command.forEach { it.undo() }
    }

}