package io.stayready;

import org.junit.Assert;
import org.junit.Test;

public class FruitTest {
    
    @Test
    public void constructerTest(){
        //Given
        String type = "Grape";
        int energy = 20;

        //When
        Fruit testFruit = new Fruit(type, energy);
        String actualType = testFruit.getType();
        int actualEnergy = testFruit.getEnergy();

        //Then
        Assert.assertEquals(type, actualType);
        Assert.assertEquals(energy, actualEnergy);
    }
}