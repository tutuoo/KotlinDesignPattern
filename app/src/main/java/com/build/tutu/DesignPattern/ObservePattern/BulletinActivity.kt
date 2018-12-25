package com.build.tutu.DesignPattern.ObservePattern

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.build.tutu.DesignPattern.R

class BulletinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bulletin)

        // 构建观察者对象
        val date = WeatherData()

        // 三个初始化接受者
        val bulletin1 = Bulletin1(date)
        val bulletin2 = Bulletin2(date)
        val bulletin3 = Bulletin3(date)

        // 模仿有新的属于来了
        date.setDate(2.0f, 3.0f, 4.0f)
        date.setDate(22.0f, 33.0f, 44.0f)
        // 删除公告2
        bulletin2.removeObserver()
        // 这里加入第四个参数  可以用于某个特定值的使用场景, 也可以直接推数据
        date.setDate(222.0f, 333.0f, 444.0f, "11")
    }
}