package com.edu.test;

public class TestThis {
    String name ;
    int age ;
    public TestThis(String  name){
        //  传入的参数 和 成员变量 相同的名称 这里就需要 显示的使用this
        this.name = name;
    }

    public TestThis(int p_age){
        // 传入的参数的名称 和 成员变量的名称不同的话就不需要显示的使用this 但是能使用this
        //this.age = p_age;
        age = p_age;
    }
}
