package com.item8.utilis;

import java.util.Scanner;

public class Reader {

    public static String scanName (){
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        return name;
    }

    public static float scanWeight (){
        Scanner scan = new Scanner(System.in);
        float weight = scan.nextFloat();
        return weight;
    }

    public static float scanHeight (){
        Scanner scan = new Scanner(System.in);
        float height = scan.nextFloat();
        return height;
    }

    public static void closeScan (){
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
