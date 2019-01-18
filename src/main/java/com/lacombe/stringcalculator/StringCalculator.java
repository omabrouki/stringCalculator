package com.lacombe.stringcalculator;

public class StringCalculator {

    private static final String COMMA = ",";
    private static final int ZERO = 0;
    private static final String SEMICOLON = ";";

    static int add(String stringToCalculate) {

        if (stringToCalculate.isEmpty())
            return ZERO;

        int sum = 0;
        String[] split = {};
        String[] splitSemiColon = {};
        if (stringToCalculate.contains(COMMA)) {
            split = stringToCalculate.split(COMMA);
            for (String number : split) {
                sum += Integer.parseInt(number);
            }
        } else if (stringToCalculate.contains(SEMICOLON)) {
            splitSemiColon = stringToCalculate.split(SEMICOLON);
            for (String number : splitSemiColon) {
                sum += Integer.parseInt(number);
            }
        } else {
            sum += Integer.parseInt(stringToCalculate);
        }

        return sum;
    }
}
