package com.edu.test;

import java.util.HashSet;

public class testI extends Object {

    public static void main(String[] args) {
        /*int a = 5;
        int b = 3;
        if (!(a==b) && (a==1+b++)){

        }
        System.out.println(a);
        System.out.println(b);*/

       /* int i = 0;
        System.out.println(i++);
        System.out.println(i--);
        System.out.println(i);
        System.out.println(i+'0');
        short myShort = 1;
        byte myByte = 5;
        byte myByte2 = 1;
        byte myByte3 = (byte) (myByte + myByte2);
        myShort = myByte;
        myShort = ++myShort;
        System.out.println(myShort);
        String a= "abc";
        int length = a.length();
        System.out.println(length);
        //char c= 14c;
        int k = 1;
        //int j = k>2?2.0:1;
        System.out.println(k>2?2.0:1);*/
        long l = System.currentTimeMillis();
        long l2 = System.currentTimeMillis();
        System.out.println(l);
        System.out.println(l2);

  /*      System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
        System.out.println(System.nanoTime());
        System.out.println(System.nanoTime());*/
        HashSet set = new HashSet();
        set.add("A");
        set.add("a");
        System.out.println(set.size());



    }

    public static void test() throws Exception {
        throw  new Exception();
    }
}
