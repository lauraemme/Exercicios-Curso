package com.exercio.conversaotemp.utils;

public class Printer {

    public static void msgReceiveCelsiusTemp (){
        System.out.print("Insira uma temperatura em Celsius: ");
    }

    public static void showResults (float fahrenheitTemp, float kelvinTemp, float reaumurTemp, float rankineTemp) {
        System.out.printf("Fahrenheit: %.2fªF",fahrenheitTemp);
        System.out.println("");
        System.out.printf("Kelivn: %.2fK",kelvinTemp);
        System.out.println("");
        System.out.printf("Réaumur: %.2fªr", reaumurTemp);
        System.out.println("");
        System.out.printf("Rankine: %.2fªRa",rankineTemp);
    }

}
