package com.edu.test;

public enum TestEnum {
    SPRING("1"),
    SUMMER("2"),
    AUTUMN("3"),
    WINTER("4")
    ;
    private String string;

    TestEnum(String s) {
        this.string = s;
    }

    public static void main(String[] args) {
        System.out.println(TestEnum.SPRING.string);
    }
}
