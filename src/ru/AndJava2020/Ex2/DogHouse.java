package ru.AndJava2020.Ex2;

import java.util.ArrayList;

public class DogHouse {
    private ArrayList<Dog> dogs=new ArrayList<Dog>();
    public DogHouse(){
        dogs=new ArrayList<Dog>();
    }
    public void add(Dog dog){
        dogs.add(dog);
        System.out.println(dog);
    }
}
