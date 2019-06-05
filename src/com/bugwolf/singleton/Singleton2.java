package com.bugwolf.singleton;

/**
 * 懒汉式:
 * 优点:延迟加载,使用对象的时候才会创建,不会浪费资源
 * 缺点:只有单线程下才可使用,多线程可能会有多个线程进入 if(singleton == null)
 *      从而会创建多个对象
 */
public class Singleton2 {

    //单例对象
    private static Singleton2 singleton;

    //私有构造方法
    private Singleton2(){}

    //静态工厂方法
    public static Singleton2 getInstance(){

        if(singleton == null){
            singleton = new Singleton2();
        }
        return  singleton;
    }
}
