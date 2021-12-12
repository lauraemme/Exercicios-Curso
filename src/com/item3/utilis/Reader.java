package com.item3.utilis;

import java.util.Scanner;

public class Reader {

    public static int scanNum (){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        return num;
    }

    public static void closeScan (){
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
