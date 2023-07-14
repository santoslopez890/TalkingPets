package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;

public class PetTest {
    @Test
    public void getInheritance(){
        //Given
        Pet cat=new Cat("bob");

        Assert.assertTrue(cat instanceof Pet);
    }


}
