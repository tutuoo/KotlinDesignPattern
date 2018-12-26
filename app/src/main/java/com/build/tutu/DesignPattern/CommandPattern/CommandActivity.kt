package com.build.tutu.DesignPattern.CommandPattern

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.build.tutu.DesignPattern.CommandPattern.Control.RemoteControl
import com.build.tutu.DesignPattern.CommandPattern.Control.SimpleRemoteControl
import com.build.tutu.DesignPattern.CommandPattern.Light.*
import com.build.tutu.DesignPattern.R

/**
 * 命令行模式
 * 将控制器和被使用者分离,控制器不关心被使用者具体是什么,只知道如何使用它(开/关)
 */
class CommandActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_command)
        // SimpleRemoteControl
        // 设置最高档
        println("-----------单个开关--------------")
        val mLight = LightOnCommand(light = Light())
        val simpleRemoteControl = SimpleRemoteControl()
        simpleRemoteControl.mSlot = mLight
        simpleRemoteControl.buttonOpen()

        // 设置最低档
        val mLowLight = LightLowCommand(light = Light())
        simpleRemoteControl.mSlot = mLowLight
        simpleRemoteControl.buttonOpen()
        println("-----------多个开关--------------")
        // RemoteControl
        val mCloseLight = LightOffCommand(light = Light())
        val remoteControl = RemoteControl()
        // 可以传空没关系,不报错
        remoteControl.setCommand(1, mLight, mCloseLight)
        remoteControl.setCommand(0, mLight, null)
        remoteControl.buttonOpen(1)
        remoteControl.buttonClose(1)
        println("-----------撤销--------------")
        remoteControl.buttonUndo()

        println("-----------组合灯--------------")
        // 组合灯参数
        val multiple = arrayOf(mLight, mLowLight)
        val multipleCommand = LightMultipleCommand(multiple)

        remoteControl.setCommand(3, multipleCommand, mCloseLight)
        remoteControl.buttonOpen(3)
        remoteControl.buttonClose(3)
        println("-----------撤销--------------")
        remoteControl.buttonUndo()
    }
}
