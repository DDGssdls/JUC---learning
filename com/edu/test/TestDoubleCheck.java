package com.edu.test;

public class TestDoubleCheck {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->{
                SingletonTest.getInstance();
            }).start();
        }

    }
}
class SingletonTest{
    // 要是不加上volatile可能会出现数据的不一致性 就是在创建对象的时候 由于执行重排导致的有引用但是对象中的内容为空的结果
    private static volatile SingletonTest instance = null;

    private SingletonTest(){
        System.out.println(Thread.currentThread().getName() + "执行成功");
    }

    public static SingletonTest getInstance() {
        if (instance == null){
            synchronized (SingletonTest.class){
                if (instance == null){
                    instance = new  SingletonTest();
                }
            }
        }
        return instance;
    }
}

enum SingletonTest2{
    INSTANCE;
    public SingletonTest2 getInstance(){
        return INSTANCE;
    }
}
