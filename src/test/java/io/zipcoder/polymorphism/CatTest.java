package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void speakTest(){
        //given
        String expected="meow";
        Cat cat=new Cat;
        //when
        String actual=Cat.speak;
        //then
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void testGetName(){
        //given
        Cat cat=new Cat;
        cat.setName("bob");
        String expected=cat.getName("bob");


    }
    @Test
    public void getInheritance(){
        //Given
        Pet cat=new Cat();

        Assert.assertTrue(cat instanceof Pet);
    }
    public void
}
