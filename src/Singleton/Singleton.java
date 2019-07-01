package Singleton;

public class Singleton {
    private static Singleton uniqueInstance;
    private Singleton(){

    }
    public static Singleton getUniqueInstance(){
        if(uniqueInstance==null){
            uniqueInstance=new Singleton();
        }
        return uniqueInstance;
    }
}
//懒汉式-线程不安全
//多线程环境下，会实例化多次uniqueInstance 不安全
//好处 延迟实例化 没用到uniqueInstance就不会实例化 节约资源
