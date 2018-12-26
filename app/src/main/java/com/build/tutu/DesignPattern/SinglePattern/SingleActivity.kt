package com.build.tutu.DesignPattern.SinglePattern

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.build.tutu.DesignPattern.R

/**
 * 单例模式
 * 唯一实例,不可多次创建
 */
class SingleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single)
        Singleton1.test()
        Singleton2.instance.test()

        println("Java------------Java")

        JavaInvoke().invoke()
        JavaInvoke().invoke2()
    }
}
