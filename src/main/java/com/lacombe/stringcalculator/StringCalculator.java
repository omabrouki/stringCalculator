package com.lacombe.stringcalculator;

public class StringCalculator {

    private static final String COMMA = "\\,|\n|\\;";
    private static final int ZERO = 0;

    static int add(String stringToCalculate) {

        if (stringToCalculate.isEmpty())
            return ZERO;
        int sum = 0;

        String[] split;

            split = stringToCalculate.split(COMMA);
            for (String number : split) {
                sum += Integer.parseInt(number);
            }

        return sum;
    }
}
