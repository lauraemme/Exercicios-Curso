package com.item4.utils;

public class Printer {

    public static void msgReceiveDollarQuote (){
        System.out.println("Insira a cotação do dólar hoje: R$");
    };

    public static void msgReceiveReaisValue (){
        System.out.println("Insira o valor em reais: R$");
    };

    public static void showDollarValue (float reaisValue, float dollarValue){
        System.out.printf("R$%.2f são US$%.2f", reaisValue, dollarValue);
    }

}
