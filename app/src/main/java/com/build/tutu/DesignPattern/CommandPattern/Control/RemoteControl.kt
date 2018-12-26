package com.build.tutu.DesignPattern.CommandPattern.Control

import com.build.tutu.DesignPattern.CommandPattern.Command.Command
import com.build.tutu.DesignPattern.CommandPattern.Command.NoCommand

// 多个开关的控制器
class RemoteControl {

    private var mOnCommand = arrayOfNulls<Command>(7)
    private var mOffCommand = arrayOfNulls<Command>(7)
    private var mUndoCommand: Command = NoCommand()

    init {
        val noCommand = NoCommand()
        // 初始化按钮状态,避免空的情况下调用 execute()
        for (i in mOnCommand.indices) {
            mOnCommand[i] = noCommand
            mOffCommand[i] = noCommand
        }
    }

    fun setCommand(slot: Int, onCommand: Command?, offCommand: Command?) {
        mOnCommand[slot] = onCommand
        mOffCommand[slot] = offCommand
    }

    //安全调用 打开
    fun buttonOpen(slot: Int) {
        mOnCommand[slot]?.let {
            it.execute()
            mUndoCommand = it
        }
    }

    // 关闭
    fun buttonClose(slot: Int) {
        mOffCommand[slot]?.let {
            it.execute()
            mUndoCommand = it
        }
    }

    // 回退
    fun buttonUndo() {
        mUndoCommand.undo()
    }

}