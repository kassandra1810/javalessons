package javalessons.inheritance.masterclass;

import javalessons.inheritance.Creature;

public class Animal implements Creature {
    protected String name;

    public Animal (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public void sayHelo() {
        System.out.println("Hello!");
    }
}
