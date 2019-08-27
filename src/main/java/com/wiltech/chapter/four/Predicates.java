package com.wiltech.chapter.four;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {

    public static void main(String[] args) {

        //create a  list of animals
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Kangaroo",true, false));
        animalList.add(new Animal("Fish",false, false));
        animalList.add(new Animal("Bird",false, true));

        //call function and pass the canHop method as argument
        print(animalList, a -> a.canHop);  // Kangaroo

        //call function and pass the canFly method as argument
        print(animalList, a -> a.canFly);  //Bird
    }

    //predicate accepting a functiuon as parameter
    private static void print(List<Animal> animals, Predicate<Animal> checker){

        //print the name of each animal that match the predicated passed on the function
        for (Animal animal: animals){
            if (checker.test(animal)){
                System.out.println(animal.getName());
            }
        }
    }
}

//dummy class to use as parameter
class Animal{
    String name;
    boolean canHop;
    boolean canFly;

    public Animal(String name, boolean canHop, boolean canFly) {
        this.name = name;
        this.canHop = canHop;
        this.canFly = canFly;
    }

    public String getName() {
        return name;
    }

    public boolean isCanHop() {
        return canHop;
    }

    public boolean isCanFly() {
        return canFly;
    }
}
