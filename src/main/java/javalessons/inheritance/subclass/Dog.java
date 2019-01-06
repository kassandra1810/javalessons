package javalessons.inheritance.subclass;

import javalessons.inheritance.masterclass.Animal;

import java.sql.SQLOutput;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    private void displayName() {
        System.out.println(name);
        sayHelo();
    }

    @Override
    public String getName() {
        return "Dog's name is " + super.getName();
    }
}
