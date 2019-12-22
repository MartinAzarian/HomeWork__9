package com.company.Animal;

public class Dog extends Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setBreed(String name) {
        this.name = name;
    }
}
