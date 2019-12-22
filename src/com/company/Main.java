package com.company;

import com.company.Animal.Animal;
import com.company.Animal.Cat;
import com.company.Animal.Dog;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat1 = new Cat("cat1");
        Cat cat2 = new Cat("cat2");
        Cat cat3 = new Cat("cat3");
        Cat cat4 = new Cat("cat4");
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        animal.setCats(cats);
        System.out.print("Cats =  ");
        for (int i = 0; i < animal.getCats().size(); i++) {
            System.out.print(animal.getCats().get(i).getName() + " ");
        }
        System.out.println();
        Dog dog1 = new Dog("dog1");
        Dog dog2 = new Dog("dog2");
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        animal.setDogs(dogs);
        System.out.print("Dogs =  ");
        for (int i = 0; i < animal.getDogs().size(); i++) {
            System.out.print(animal.getDogs().get(i).getName() + " ");

        }
    }
}