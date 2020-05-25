package com.edu.test;

import java.util.Scanner;

public class TestStatic {

    int x = 2000;

    public TestStatic(){

    }

    public static void main(String[] args) {
        int x = new TestStatic().x;
        System.out.println(x);
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        System.out.println("i"+(i*i));
        System.out.println("j"+j*j*j);

    }
}
