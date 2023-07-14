package io.zipcoder.polymorphism;

public class Dog extends Pet{
    public Dog(){

    }




    public Dog(String name) {
        super(name);
    }

    public String speak() {
        return "Meow";
    }
}
