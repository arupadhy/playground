package com.home.arvind.animal;


public class Horse implements Animal {

    private String name;

    public Horse(String name) {
        this.name = name;
    }

    @Override
    public void shout() {
        System.out.println(name + " hmmmmmmhmmmmmmm");
    }

    @Override
    public String getName() {
        return this.name;
    }

}
