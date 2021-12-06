package com.item5.utils;

import java.util.Scanner;

public class Reader {

    public static float scanInchValue(){
        Scanner scanner = new Scanner(System.in);

        Printer.msgReceiveInchValue();

        float inchValue = scanner.nextFloat();

        return  inchValue;
    }

}
