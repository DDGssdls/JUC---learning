package com.edu.test;

public class Test1 {
    static int a;
    static int b = 0;


    public static void main(String[] args) {
       /* Singleton1 s = Singleton1.getSingleton();
        System.out.println("counter1 = " + s.counter1);
        System.out.println("counter2 = " + s.counter2);*/

        System.out.println(a ++);
        System.out.println(b ++);
    }
}
class Singleton1 {

    private static Singleton1 singleton1 = new Singleton1();
    public static int counter1;
    public static int counter2 = 0;

    private Singleton1() {
        counter1++;
        counter2++;
    }

    public static Singleton1 getSingleton() {
        return singleton1;
    }
}

class TestCodeSeg {
    static {
        System.out.println("1");
    }

    public TestCodeSeg() {
        System.err.println("3");
    }
    {
        System.out.println("2");
    }
    public static void main(String[] args) {
        new TestCodeSeg();
        int i = 10;
        int j = 11;
       // System.out.println("i - j" + i - j);
    }
}
class Demo1 {
    int i = getJ();
    int j = 0;
    public int getJ() {
        j = 10;
        System.out.println(i);
        return j;
    }
    public static void main(String[] args) {
        Demo1 demo = new Demo1();
        System.out.println(demo.j);
        System.out.println(demo.i);
    }
}
class Test {

    public static void main(String[] args) {
        System.out.println(method());
    }
    public static boolean method() {
        try {
            return true;
        } finally {
            return false;
        }
    }
}
class Test12 {
    public static void main(String[] args) {
        boolean flag = false;
        if (flag = true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.equals(new Object());
    }
}