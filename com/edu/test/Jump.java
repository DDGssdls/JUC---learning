package com.edu.test;

public class Jump {

    static int sum = 0;
    public static int JumpFloorII(int target) {
        if(target == 1){
            return 1;
        }
        if (target == 2){
            return 3;
        }
        for (int i = target; i > 2; i --){

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(JumpFloorII(2));
    }
}
