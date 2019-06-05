package com.bugwolf.singleton;

/**
 * 懒汉式(双重加锁检查DCL):
 * 优点:双重检查,延迟加载,使用volatile禁止指令重排序,线程安全
 */
public class Singleton4 {

    //单例对象 volatile:禁止指令重排序
    private volatile static Singleton4 singleton;

    //私有构造方法
    private Singleton4(){}

    //静态工厂方法
    public static  Singleton4 getInstance(){
        if(singleton == null){
            synchronized(Singleton4.class){
                if(singleton == null) {
                    singleton = new Singleton4();
                }
            }
        }
        return  singleton;
    }
}
