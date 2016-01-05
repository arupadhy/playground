package com.home.arvind.animal;


public class Cat implements Animal {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void shout() {
        System.out.println(name + "meowingggg");
    }

    @Override
    public String getName() {
        return this.name;
    }

}
