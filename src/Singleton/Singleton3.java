package Singleton;

public class Singleton3 {
    private volatile static Singleton3 uniqueInstance;
    private Singleton3() {
    }
    public static Singleton3 getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton3.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton3();
                }
            }
        }
        return uniqueInstance;
    }
}
//双重校验锁-线程安全
//volatile关键字  禁止JVM的指令重排
//第二个if语句加锁，只有一个线程进入 不会出现uniqueInstance==null两个线程同时实例化

