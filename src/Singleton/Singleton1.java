package Singleton;

public class Singleton1 {
    private static Singleton1 uniqueInstance = new Singleton1();
    private Singleton1(){
    }
    public static Singleton1 getUniqueInstance(){
        return uniqueInstance;
    }
}
//饿汉式-线程安全 直接实例化
//丢失了延迟实例化带来的节约资源的好处