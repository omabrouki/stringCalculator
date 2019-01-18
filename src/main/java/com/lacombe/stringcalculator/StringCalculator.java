package com.lacombe.stringcalculator;

public class StringCalculator {
    public static int add(String stringToCalculate) {
        if (stringToCalculate.equals(""))
            return 0;
        return Integer.parseInt(stringToCalculate);
    }
}
