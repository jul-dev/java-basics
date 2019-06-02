package LearningPackage.polymorphism;

import java.lang.reflect.Array;

public class App  {


    private static Animal [] createAnimalArray (int num){
        Animal [] animals=new Animal[num];

        for (int i=0; i<num; i++){
            if(i%3==0)
                animals [i] = new Animal();
            if(i%3==1)
                animals [i] = new Cat();
            if(i%3==2)
                animals [i] = new Dog();
        }
        return animals;
    }
    public static void main(String[] args) {

        for (Animal a : createAnimalArray(100)){
            a.animalSound();
        }
    }
}
