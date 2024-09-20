package com.somnath.calc;

import java.util.LinkedList;

public class Calculator {
    public static long addNumbers(LinkedList<Integer> numbers) {
        long result = 0L;

        for (Integer number : numbers) {
            result += number;
        }

        return result;
    }

    public static long mulNumbers(LinkedList<Integer> numbers) {
        long result = 1L;

        for (Integer number : numbers) {
            result *= number;
        }

        return result;
    }

    public static double divNumbers(LinkedList<Integer> numbers) {
        double result = numbers.getFirst();

        for (int i = 1; i < numbers.size(); i++) {
            result /= numbers.get(i);
        }

        return result;
    }


    public static long subNumbers(LinkedList<Integer> numbers) {
        long result = numbers.getFirst();
        
        for (int i = 1; i < numbers.size(); i++) {
            result -= numbers.get(i);
        }

        return result;
    }

}
