package com.edu.test;

public class TEst extends Object {



    public static int Fibonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);



    }

    public static void main(String[] args) {
        /*int fibonacci = Fibonacci(39);
        System.out.println(fibonacci);*/
        long l1 = 1;
        System.out.println(l1);
        System.out.println(new TEst().hashCode());

    }
}
