package com.exercio.conversaotemp.utils;

import java.util.Scanner;

public class Reader {

    public static float scanTemp (){
        Scanner scan = new Scanner(System.in);

        Printer.msgReceiveCelsiusTemp();

        float celciusTemp = scan.nextFloat();

        return celciusTemp;
    }
}
