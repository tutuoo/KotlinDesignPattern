package com.build.tutu.DesignPattern.SinglePattern

// Kotlin 语法糖 本质是饿汉式 不管用不用直接创建
object Singleton1 {

    fun test() {
        println("------------Singleton1")
    }
}


/** 本质上是这样的

public final class Singleton1 {
    public static final Singleton1 INSTANCE;

    private Singleton1() {
        INSTANCE = (Singleton1)this;
    }

    static {
        new Singleton1();
    }
}
 **/

/** 如果是 Java 调用
 *  Singleton1.INSTANCE.test();
 */