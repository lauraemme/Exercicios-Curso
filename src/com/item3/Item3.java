package com.item3;

import com.item3.utilis.Printer;
import com.item3.utilis.Reader;

public class Item3 {

    public static void main (String[] args){

        int[] arrayNumbers = new int[5];

        Printer.msgWriteNumber();

        for (int i = 0; i < arrayNumbers.length; i++){
            int num = Reader.scanNum();
            arrayNumbers[i] = num;
        }

        Printer.printOddAndEvenNumbers(arrayNumbers);
    }
}
