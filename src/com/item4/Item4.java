package com.item4;

import com.item4.service.Calculator;
import com.item4.utilis.Printer;
import com.item4.utilis.Reader;

public class Item4 {

    public static void main (String[] args){

        float[] numbers = new float[5];

        Printer.msgWriteNumbers();

        for (int i = 0; i < numbers.length; i++){
            float num = Reader.scanNum();
            numbers[i] = num;
        }

        Reader.closeScan();

        float higherNum = Calculator.higherNumber(numbers);
        float smallestNum = Calculator.smallestNumber(numbers);
        float mean = Calculator.mean(numbers);

        Printer.printResults(higherNum, smallestNum, mean);
    }
}
