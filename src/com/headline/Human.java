package com.headline;

/**
 * Created by w7397 on 2017/3/16.
 */
public class Human extends Animal {
    private String country;

    public Human(String name, int age, String country) {
        super(name, age);
        this.country = country;
    }

    public void say() {
        System.out.println("This is " + getName() + " from " + country);
    }

}
