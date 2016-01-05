package com.home.arvind.animal;


public class Dog implements Animal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void shout() {
        System.out.println(name + " I am Barking now");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
