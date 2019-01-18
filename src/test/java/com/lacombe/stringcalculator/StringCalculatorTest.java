package com.lacombe.stringcalculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void withEmptyStringShouldReturnZero() {
        int stringCalculatorResult = StringCalculator.add("");
        assertEquals(0,stringCalculatorResult);
    }

    @Test
    public void withOneNumberShouldReturnNumber() {
        int stringCalculatorResult = StringCalculator.add("1");
        assertEquals(1, stringCalculatorResult);
        stringCalculatorResult = StringCalculator.add("2");
        assertEquals(2, stringCalculatorResult);
        stringCalculatorResult = StringCalculator.add("3");
        assertEquals(3, stringCalculatorResult);
    }

    @Test
    public void withNumbersShouldReturnTheSum() {
        int stringCalculatorResult = StringCalculator.add("1,1");
        assertEquals(2,  stringCalculatorResult);
        stringCalculatorResult = StringCalculator.add("2,1");
        assertEquals(3,  stringCalculatorResult);
        stringCalculatorResult = StringCalculator.add("2,1,3");
        assertEquals(6,  stringCalculatorResult);
    }

    @Test
    public void withNumbersAndCarriageReturnShouldReturnTheSum() {
        int stringCalculatorResult = StringCalculator.add("2\n2,1");
        assertEquals(5, stringCalculatorResult);
    }
}
