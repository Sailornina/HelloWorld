package com.example.animals;

public class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println("**" + name + " is walking**");
    }
}
