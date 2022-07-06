package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void SetUp() {
        calculator = new Calculator();
    }

    @Test
    public void ShouldReturnTheSumOfTheTwoIntegers() {
        Integer expectedValue = 9;
        Integer actualValue = calculator.add(5, 4);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void ShouldReturnTheDivisionOfTheTwoIntegers() {
        Integer expectedValue = 5;
        Integer actualValue = calculator.divide(10, 2);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void ShouldReturnTheMultiplicationOfTheTwoIntegers() {
        Integer expectedValue = 9;
        Integer actualValue = calculator.multiply(3, 3);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void ShouldReturnTheSubtractionOfTheTwoIntegers() {
        Integer expectedValue = 1;
        Integer actualValue = calculator.subtract(5, 4);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void ShouldReturnTheSumOfTheTwoDouble() {
        double expectedValue = 4.0;
        double actualValue = calculator.add(1.5, 2.5);
        assertEquals(expectedValue, actualValue,.001);

    }

    @Test
    public void ShouldReturnTheDivisionOfTheTwoDouble() {
        double expectedValue = 5.0;
        double actualValue = calculator.divide(10.0, 2.0);
        assertEquals(expectedValue, actualValue,.001);
    }

    @Test
    public void ShouldReturnTheMultiplicationOfTheTwoDouble() {
        double expectedValue = 9.0;
        double actualValue = calculator.multiply(3.0, 3.0);
        assertEquals(expectedValue, actualValue,.001);
    }

    @Test
    public void ShouldReturnTheSubtractionOfTheTwoDouble() {
        double expectedValue = 5.0;
        double actualValue = calculator.subtract(5.5, 0.5);
        assertEquals(expectedValue, actualValue,.001);
    }
}