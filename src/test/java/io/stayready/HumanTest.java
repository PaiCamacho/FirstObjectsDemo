package io.stayready;

import org.junit.Assert;
import org.junit.Test;

public class HumanTest {
    @Test
    public void constructorTest(){
        //Given
        String first = "Fred";
        String last = "Flintstone";
        int energy = 50;

        //When
        Human testHuman = new Human(first, last, energy);
        String actualFirst = testHuman.getFirstName();
        String actualLast = testHuman.getLastName();
        int actualEnergy = testHuman.getEnergy();

        //Then
        Assert.assertEquals(first, actualFirst);
        Assert.assertEquals(last, actualLast);
        Assert.assertEquals(energy, actualEnergy);
    }
    @Test
    public void eatTest(){
        //Given
        Fruit banana = new Fruit("banana", 10);
        int expectedEnergy = 60;
        Human testHuman = new Human("Bob", "Will", 50);

        //When
        testHuman.eat(banana);
        int actualEnergy = testHuman.getEnergy();

        //Then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }
    @Test
    public void workTest(){
        //Given 
        Human testHuman = new Human("Steve", "Wonders", 50);
        int expectedEnergy = 30;

        //When
        testHuman.work(2);
        int actualEnergy = testHuman.getEnergy();

        //Then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }
    @Test
    public void energyMaxTest(){
        //Given
        Human testHuman = new Human("Steve", "Wonders", 50);
        Fruit testFruit1 = new Fruit("mango", 20);
        Fruit testFruit2 = new Fruit("strawberry", 10);
        Fruit testFruit3 = new Fruit("cherry", 40);
        Human.maxEnergy = 100;

        //When
        testHuman.eat(testFruit1);
        testHuman.eat(testFruit2);
        testHuman.eat(testFruit3);
        int actualEnergy = testHuman.getEnergy();

        //Then
        Assert.assertEquals(100, actualEnergy); 
    }
    @Test
    public void workMin(){
        //Given
        Human testHuman = new Human("Steve", "Wonders", 50);

        //When
        testHuman.work(6);
        int actualEnergy = testHuman.getEnergy();

        //Then 
        Assert.assertEquals(50, actualEnergy);
    }
    @Test
    public void maxEnergyChangeTest(){
        Human h1 = new Human("Steve", "Wonder", 50);
        Fruit testFruit1 = new Fruit("mango", 20);
        Fruit testFruit2 = new Fruit("strawberry", 10);
        Fruit testFruit3 = new Fruit("cherry", 40);

        Human.maxEnergy = 150;

        h1.eat(testFruit1);
        h1.eat(testFruit2);
        h1.eat(testFruit3);

        int actualEnergy = h1.getEnergy();

        Assert.assertEquals(120, actualEnergy); 
    }
}