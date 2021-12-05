package com.item3.utils;

public class Printer {

    public static void msgReceiveACelsiusTemp (){
        System.out.print("Insira uma temperatura em Celsius: ");
    }

    public static void showResult (float celsiusTemp, float farenheitTemp){
        System.out.printf("%.2fºC em farenheit é %.2fºF", celsiusTemp, farenheitTemp);
    }

}
