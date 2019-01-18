package com.lacombe.stringcalculator;

public class StringCalculator {

    public static final String COMMA = ",";
    public static final int ZERO = 0;
    public static final String EMPTY = "";

    public static int add(String stringToCalculate) {

        if (stringToCalculate.isEmpty())
            return ZERO;

        String[] split = stringToCalculate.split(COMMA);
        int sum = 0;
        for (String number : split) {
            sum += Integer.parseInt(number);
        }

        return sum;
    }
}
