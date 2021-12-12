package com.item4.utilis;

import java.util.Scanner;

public class Reader {

    public static float scanNum (){
        Scanner scan = new Scanner(System.in);
        float num = scan.nextFloat();
        return num;
    }

    public static void closeScan (){
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
