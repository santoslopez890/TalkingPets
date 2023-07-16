package io.zipcoder.polymorphism;

public abstract class Pet implements Animal{
    private String name;
    private int age;
public Pet(){
    name="nully";
}
    public Pet(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name=name;
    }


}
