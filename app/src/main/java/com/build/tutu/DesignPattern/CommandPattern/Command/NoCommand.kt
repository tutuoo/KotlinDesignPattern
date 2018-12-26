package com.build.tutu.DesignPattern.CommandPattern.Command

class NoCommand : Command {

    override fun undo() {
        println("===============无命令")
    }

    // 增加没有命令时的情况
    override fun execute() {
        println("===============无命令")
    }

}