package com.item2.utils;

import java.util.Scanner;

public class Reader {

    public static float scanNum (){
        Scanner scan = new Scanner(System.in);

        Printer.msgReceiveANumber();

        return scan.nextFloat();
    }
}
