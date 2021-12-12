package com.item2.utilis;

import java.util.Scanner;

public class Reader {

    public static String scanWord (){
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        return word;
    }

    public static void closeScan (){
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
