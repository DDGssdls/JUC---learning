package com.edu.test;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class User {

    private String name;
    private int userId;
    private int age;
    private boolean gender;

    public User(String name, int userId, int age, boolean gender) {
        this.name = name;
        this.userId = userId;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId &&
                age == user.age &&
                gender == user.gender &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {


        return Objects.hash(name, userId, age, gender);
    }
    private int newHashCode(){
        List<? extends Serializable> serializables = Arrays.asList(name, userId, age, gender);
        int result = 1;

        for (Serializable serializable : serializables) {
            result = 31 * result + (serializable.hashCode());
        }
        return result;
    }

    public static void main(String[] args) {
        User user = new User("1", 1, 1, true);
        int i = user.hashCode();
        int i1 = user.newHashCode();
        System.out.println(i);
        System.out.println(i1);
    }
}
