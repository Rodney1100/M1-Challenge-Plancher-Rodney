package com.company.factory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {
    IceCream iceCream;
    @Before
    public void setUp(){
        iceCream = new IceCream();
    }

    @Test
    public void doesThisHaveNutsInIt(){
        boolean expectedValue = true;
        boolean actualValue = iceCream.setDoesHaveNuts(true);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void shouldReturnThePrice(){
        double expectedValue = 20;
        double actualValue = iceCream.setPrice(10,10);
        assertEquals(expectedValue,actualValue,.0001);
    }

    @Test
    public void shouldHaveATemperatureOf30DegreeFahrenheit(){
        double expectedValue = 39;
        double actualValue = iceCream.setTemperature(39);
        assertEquals(expectedValue,actualValue, 0.0001);
    }

}