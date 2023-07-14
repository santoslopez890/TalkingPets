package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void speakTest(){
        //given
        String expected="Meow";
        Cat cat=new Cat(expected);
        //when
        String actual=cat.speak();
        //then
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void testGetName(){

        //given
        String expected="bob";
        Cat cat=new Cat();
        cat.setName(expected);
        //then
        String actual=cat.getName();
        //then
        Assert.assertEquals(actual,expected);


    }
    @Test
    public void getInheritance(){
        //Given
        Pet cat=new Cat("bob");

        Assert.assertTrue(cat instanceof Pet);
    }

}
