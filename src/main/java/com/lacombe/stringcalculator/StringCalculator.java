package com.lacombe.stringcalculator;

public class StringCalculator {
    public static int add(String stringToCalculate) {
        if (stringToCalculate.equals(""))
            return 0;
        String separators = "\\,|\n";
        String[] split = stringToCalculate.split(separators);
        int sum = 0;
        for (String number : split) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
