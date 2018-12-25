package com.build.tutu.DesignPattern.SinglePattern

// 懒加载效率高,用到才去创建
class Singleton2 private constructor() {

    // companion object 相当于 Java 的静态声明 只会执行一次 lazy 是线程安全的
    companion object {
        val instance: Singleton2 by lazy { Singleton2() }
    }

    fun test() {
        println("------------Singleton2")
    }
}


/**
public class Singleton {
    // 当 singleton 变量被初始化成实例时,多个线程正确地处理 singleton 变量.
    private volatile static Singleton singleton;

    private Singleton() {
    }
    // 加同步锁 让初始化的过程不会受多线程影响.
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
 */
