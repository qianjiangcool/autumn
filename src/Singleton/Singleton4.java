package Singleton;

public class Singleton4 {
    private Singleton4() {
    }
    private static class SingletonHolder {
        private static final Singleton4 uniqueInstance = new Singleton4();
    }
    public static Singleton4 getUniqueInstance() {
        return SingletonHolder.uniqueInstance;
    }
}
/*
静态内部类实现
当 Singleton.Singleton 类被加载时，静态内部类 SingletonHolder 没有被加载进内存
只有当调用 getUniqueInstance() 方法从而触发 SingletonHolder.uniqueInstance 时 SingletonHolder 才会被加载
此时初始化 INSTANCE 实例
好处 :不仅延迟实例化 而且由JVM提供对线程安全的支持
 */