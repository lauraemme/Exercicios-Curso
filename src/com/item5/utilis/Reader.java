package com.item5.utilis;

import java.util.Scanner;

public class Reader {

    public static String scanName (){
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        return name;
    }

    public static void closeScan (){
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
