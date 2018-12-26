package com.build.tutu.DesignPattern.CommandPattern.Command

interface Command {

    // 执行命令
    fun execute()

    // 撤销命令
    fun undo()
}