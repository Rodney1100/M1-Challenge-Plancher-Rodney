package com.company;

import com.company.interfaces.Converter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {
private Converter converter1;
    private Converter converter2;

@Before
public void SetUp(){
    converter1 = new ConverterSwitch();
    converter2 = new ConverterIf();
}
    @Test
    public void shouldReturnAMonthThatCorrespondToTheNumberUsingSwitch() {
        String expectedOutput = "January";
        String actualOutput = converter1.convertMonth(1);
        assertEquals(expectedOutput,actualOutput);
    }
    @Test
    public void shouldReturnAMonthThatCorrespondToTheNumberUsingIf() {
        String expectedOutput = "January";
        String actualOutput = converter2.convertMonth(1);
        assertEquals(expectedOutput,actualOutput);

    }
    @Test
    public void shouldReturnADayThatCorrespondToTheNumberUsingSwitch() {
        String expectedOutput = "sunday";
        String actualOutput = converter1.convertDay(1);
        assertEquals(expectedOutput,actualOutput);
    }
    @Test
    public void shouldReturnADayThatCorrespondToTheNumberUsingIf() {
        String expectedOutput = "sunday";
        String actualOutput = converter2.convertDay(1);
        assertEquals(expectedOutput,actualOutput);
    }
}