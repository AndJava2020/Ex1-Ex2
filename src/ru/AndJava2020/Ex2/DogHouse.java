package ru.AndJava2020.Ex2;

import java.util.ArrayList;

public class DogHouse {
    private Dog[] dogs;
    private int i=0;
    public DogHouse(){
        dogs=new Dog[10];
    }
    public void add(Dog ... dog){
        int j=0;
        for(;j< dog.length;i++,j++){
            System.out.println(dog[j]);
            dogs[i]=dog[j];
        }
    }
}
