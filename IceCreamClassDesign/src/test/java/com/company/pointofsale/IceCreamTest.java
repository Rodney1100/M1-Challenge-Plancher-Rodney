package com.company.pointofsale;

import com.company.pointofsale.IceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {
    IceCream iceCream;
    @Before
    public void setUp(){iceCream = new IceCream();}

    @Test
    public void shouldGiveTheStorePriceForIceCream(){
        double expectedValue = 1.50;
        double actualValue = iceCream.setPriceInStore(1);
        assertEquals(expectedValue,actualValue, .00001);
    }
    @Test
    public void shouldGiveTheNameForIceCream(){
        String expectedValue = "BlueBarry";
        String actualValue = iceCream.setName(1);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void shouldGiveTheStorePriceForIceCream(){
        double expectedValue = 1;
        double actualValue = iceCream.setPriceInStore(1);
        assertEquals(expectedValue,actualValue, .00001);
    }
}