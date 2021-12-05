package com.exercicio2.utils;

import java.util.Scanner;

public class Reader {

    public static int scanNum (){
        Scanner scan = new Scanner(System.in);

        Printer.msgReceiveANumber();

        int num = scan.nextInt();

        return num;
    }
}
