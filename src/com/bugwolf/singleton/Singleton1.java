package com.bugwolf.singleton;

/**
 * 饿汉式:
 * 优点:写法简单,类加载时完成对象创建,不存在线程安全问题
 * 缺点:没有达到延迟加载的效果,如果对象一直未被使用,会造成资源浪费
 */
public class Singleton1 {

    //单例对象
    private static  Singleton1 singleton = new Singleton1();

    //私有构造方法
    private  Singleton1(){}

    //静态工厂方法
    public static  Singleton1 getInstance(){
        return  singleton;
    }
}
