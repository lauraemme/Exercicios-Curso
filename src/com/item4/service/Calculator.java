package com.item4.service;

public class Calculator {

    public static float higherNumber (float[] numbers){
        float higherNumber = numbers[0];

        for (float num: numbers){
            if (num > higherNumber){
                higherNumber = num;
            }
        }

        return higherNumber;
    }

    public static float smallestNumber (float[] numbers){
        float smallestNumber = numbers[0];

        for (float num: numbers){
            if (num < smallestNumber){
                smallestNumber = num;
            }
        }

        return smallestNumber;
    }

    public static float mean (float[] numbers){
        float sum = 0;

        for (float num: numbers){
            sum += num;
        }

        float average = sum / numbers.length;

        return average;
    }
}
