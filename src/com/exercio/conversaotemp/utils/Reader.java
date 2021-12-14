package com.exercio.conversaotemp.utils;

import java.util.Scanner;

public class Reader {

    public static float scanTemp (){
        Scanner scan = new Scanner(System.in);
        float celciusTemp = scan.nextFloat();
        return celciusTemp;
    }

    public static int scanOption (){
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        return option;
    }

    public static void closeScan(){
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
