package com.edu.test;



public class TestSuper {
    public static void main(String[] args) {
        Base t = new Child();
        t.test();
        System.out.println(t.i);
        t.test1();
        Child t1 = (Child) t;
        t1.test();
        System.out.println(t1.i);
        t1.test1();
    }
}

class Base{

    public int i = 1;
    public  void  test(){
        System.out.println(i);
    }
    public static void test1(){
        System.out.println("Base");
    }
}

class Child extends  Base{
    public int i = 2;

    public Child(){
        System.out.println();
       /* super();*/
    }

    public  void  test(){
        System.out.println(i);
    }
    public static void test1(){
        System.out.println("Child");
    }
}
