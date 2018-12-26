package com.build.tutu.DesignPattern

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.build.tutu.DesignPattern.CommandPattern.CommandActivity
import com.build.tutu.DesignPattern.DecoratePattern.DecorateActivity
import com.build.tutu.DesignPattern.FactoryPattern.FactoryActivity
import com.build.tutu.DesignPattern.ObservePattern.BulletinActivity
import com.build.tutu.DesignPattern.SinglePattern.SingleActivity
import com.build.tutu.DesignPattern.TacticsPattern.TacticsModelActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 模式来源于《Head First设计模式》一书
 */
class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTacticsBT.setOnClickListener(this)
        mObserver.setOnClickListener(this)
        mDecorate.setOnClickListener(this)
        mFactory.setOnClickListener(this)
        mSingle.setOnClickListener(this)
        mCommand.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            // 策略模式
            mTacticsBT -> navigation(TacticsModelActivity::class.java)
            // 观察者模式
            mObserver -> navigation(BulletinActivity::class.java)
            // 装饰模式
            mDecorate -> navigation(DecorateActivity::class.java)
            // 工厂模式
            mFactory -> navigation(FactoryActivity::class.java)
            // 单例模式
            mSingle -> navigation(SingleActivity::class.java)
            // 命令行模式
            mCommand -> navigation(CommandActivity::class.java)

        }
    }

    private fun navigation(activityClass: Class<*>) {
        val intent = Intent(this, activityClass)
        startActivity(intent)
    }
}
