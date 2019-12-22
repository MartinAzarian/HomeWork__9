package com.company.Animal;

import java.util.ArrayList;

public class Animal {
    private ArrayList<Cat> cats;
    private ArrayList<Dog> dogs;


    public Animal(String name, ArrayList<Cat> cats, ArrayList<Dog> dogs) {
        this.cats = cats;
        this.dogs = dogs;
    }

    public Animal() {
    }

    public ArrayList<Cat> getCats() {
        return cats;
    }

    public void setCats(ArrayList<Cat> cats) {
        this.cats = cats;
    }

    public ArrayList<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(ArrayList<Dog> dogs) {
        this.dogs = dogs;
    }


}