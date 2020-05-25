package com.edu.test;

public class TestSingleton {
    // 第一种方式就是使用饿汉式 线程安全
    public static void main(String[] args) {
       Singleton instance = Singleton.getInstance();
       Singleton instance1 = Singleton.getInstance();
       System.out.println(instance == instance1);
   /*     Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance1 = Singleton2.getInstance();
        System.out.println(instance == instance1);*/

    }
}
class Singleton{

    private static volatile Singleton singleton;
    private Singleton(){

    }
   private static class SingletonInstance{
        private static final Singleton SINGLETON = new Singleton();
   }
   public static Singleton getInstance(){
        return SingletonInstance.SINGLETON;
   }

}
class Singleton2{
    // 这是懒汉式的创建
    public static volatile Singleton2 singleton2;
    // 进行构造器的私有
    private Singleton2(){

    }
    // 获取方法
    public static Singleton2 getInstance(){
        // 这里使用双重检测
        if(singleton2 == null){
            synchronized (Singleton2.class){
                if (singleton2 == null){
                    singleton2 = new Singleton2();
                }
            }

        }
        return singleton2;
    }
}

