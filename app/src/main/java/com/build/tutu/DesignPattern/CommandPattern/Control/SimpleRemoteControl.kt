package com.build.tutu.DesignPattern.CommandPattern.Control

import com.build.tutu.DesignPattern.CommandPattern.Command.Command
import com.build.tutu.DesignPattern.CommandPattern.Command.NoCommand
// 一个开关的控制器
class SimpleRemoteControl {

    var mSlot: Command = NoCommand()

    fun buttonOpen() {
        mSlot.execute()
    }
}