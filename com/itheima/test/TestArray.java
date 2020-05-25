package com.itheima.test;

import java.util.Arrays;

public class TestArray {

    public static void main(String[] args) {
        int[] arr = {1,4,1,4,2,5,4,5,8,7,8,77,88,5,4,9,6,2,4,1,5};
        test(arr);
    }

    public  static void test(int[] arr){
        if(arr == null || arr.length == 0 ){
            System.out.println("错误");
        }
        int count = 0;
        int number = arr[0];
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int num : arr){
            if(num == number){
                count ++;
            }else{

                System.out.println(number+"出现的次数="+count);
            }
            number = num;
            count = 1;
        }
    }
}
