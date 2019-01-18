package com.lacombe.stringcalculator;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void withEmptyStringShouldReturnZero() {
        int stringCalculatorResult = StringCalculator.add("");
        Assert.assertEquals(0,stringCalculatorResult);
    }

    @Test
    public void withOneNumberShouldReturnNumber() {
        int stringCalculatorResult = StringCalculator.add("1");
        Assert.assertEquals(1, stringCalculatorResult);
        stringCalculatorResult = StringCalculator.add("2");
        Assert.assertEquals(2, stringCalculatorResult);
        stringCalculatorResult = StringCalculator.add("3");
        Assert.assertEquals(3, stringCalculatorResult);
    }
}
