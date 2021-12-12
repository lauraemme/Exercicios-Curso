package com.item7.utilis;

import java.util.Scanner;

public class Reader {

    public static String scanName (){
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        return name;
    }

    public static int scanAge (){
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        return age;
    }

    public static void closeScan (){
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
