package com.bugwolf.singleton;

/**
 * 懒汉式:
 * 优点:延迟加载,getInstance同步,保证线程安全
 * 缺点:getInstance同步,造成效率低下,需要改进
 *
 */
public class Singleton3 {

    //单例对象
    private static Singleton3 singleton;

    //私有构造方法
    private Singleton3(){}

    //静态工厂方法
    public static  synchronized  Singleton3 getInstance(){
        if(singleton == null){
            singleton = new Singleton3();
        }
        return  singleton;
    }
}
