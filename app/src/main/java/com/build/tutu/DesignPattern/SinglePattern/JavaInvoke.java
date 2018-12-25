package com.build.tutu.DesignPattern.SinglePattern;

/**
 * Java 被调用
 */
public class JavaInvoke {

    public void invoke() {
        Singleton1.INSTANCE.test();
    }

    public void invoke2() {
        Singleton2.Companion.getInstance().test();
    }

}


