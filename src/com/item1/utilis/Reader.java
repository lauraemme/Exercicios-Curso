package com.item1.utilis;

import java.util.Scanner;

public class Reader {

    public static String scanFruit (){
        Scanner scan = new Scanner(System.in);
        String fruit = scan.next();
        return fruit;
    }

    public static void closeScan (){
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
