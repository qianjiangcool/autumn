package Singleton;

public class Singleton2 {
    private static Singleton2 uniqueInstance;
    private Singleton2(){
    }
    public static synchronized Singleton2 getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton2();
        }
        return uniqueInstance;
    }
}
//懒汉式-线程安全 对getUniqueInstance加锁，同一时间点只能有一个线程进入，避免了多次实例化
//其他线程必须等待  线程阻塞时间过长 有性能问题