package com.item3.utils;

import java.util.Scanner;

public class Reader {

    public static float scanCelsiusTemp (){
        Scanner scan = new Scanner(System.in);

        Printer.msgReceiveACelsiusTemp();

        float celsiusTemp = scan.nextFloat();

        return celsiusTemp;
    }
}
