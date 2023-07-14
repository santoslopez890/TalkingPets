package io.zipcoder.polymorphism;
import java.util.Scanner;
public class MainApplication {
    public static void main(String[] args) {
        int pets;
        String petType;
        String petName;
        Scanner in=new Scanner (System.in);
        Scanner in2=new Scanner (System.in);
        System.out.println("how many pets they have");
        pets=in.nextInt();
        for (int i = 0; i < pets; i++) {
            System.out.println("what type is each");
            petType=in2.nextLine();
            System.out.println("what type is each");
            petName=in2.nextLine();

        }

    }



}
