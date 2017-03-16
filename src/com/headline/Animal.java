package com.headline;

/**
 * Created by w7397 on 2017/3/16.
 */
public class Animal implements Talking {
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println("This is Animal");
    }
}
