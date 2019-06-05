package com.bugwolf.singleton;

/**
 * Holder模式:
 * 不同于一般懒汉式在类加载时候就实例化,静态内部类只有被调用的时候才会实例化
 * 优点:延迟加载,线程安全,无锁
 */
public class Singleton5 {


    //静态成员式内部类,与外部类没有绑定关系,只有被调用的时候才会实例化
    private static class SingletonHolder{
        // 静态初始化器,jvm内部保证线程安全
        private static Singleton5 singleton = new Singleton5();
    }

    //私有构造方法
    private Singleton5(){}

    //静态工厂方法
    public static Singleton5 getInstance(){
        return  SingletonHolder.singleton;
    }
}
