package io.zipcoder.polymorphism;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class MainApplication  {
    static ArrayList <Pet> petlist=new ArrayList<>();
    public static void main(String[] args) {
        int pets;
        String petType;
        String petName;
        Scanner in=new Scanner (System.in);
        Scanner in2=new Scanner (System.in);
        System.out.println("how many pets do you want " );
        pets=in.nextInt();
        for (int i = 0; i < pets; i++) {
            System.out.println("what type is each +\n" +
                    "Options are Cat,Dog,RedPanda");
            petType=in2.nextLine();
            if(Objects.equals(petType, "Dog")){
                System.out.println("what name do you want");
                petName=in2.nextLine();
                Pet doggo=new Dog(petName);
                petlist.add(doggo);
            }
            if (Objects.equals(petType, "Cat")){
                System.out.println("what name do you want");
                petName=in2.nextLine();
                Pet cat=new Cat(petName);
                petlist.add(cat);

            }
            if (Objects.equals(petType, "RedPanda")){
                System.out.println("what name do you want");
                petName=in2.nextLine();
                Pet panda=new RedPanda(petName);
                petlist.add(panda);
            }

        }
        StringBuilder petlists= new StringBuilder();
        for (Pet j: petlist) {

            petlists.append("\n Pet ").append(j.getName()).append(" Says ").append(j.speak());

        }
        System.out.println(petlists);

    }



}
