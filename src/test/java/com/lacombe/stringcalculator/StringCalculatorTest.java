package com.lacombe.stringcalculator;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void withEmptyStringShouldReturnZero() {
        int stringCalculatorResult = StringCalculator.add("");
        Assert.assertEquals(0,stringCalculatorResult);
    }
}
