package com.item4.utilis;

public class Printer {

    public static void msgWriteNumbers (){
        System.out.println("Digite 5 números: ");
    }

    public static void printResults (float higherNum, float smallestNum, float mean){
        System.out.println("Análise da lista de números");
        System.out.printf("Maior número: %.2f", higherNum);
        System.out.println();
        System.out.printf("Menor número: %.2f", smallestNum);
        System.out.println();
        System.out.printf("Média: %.2f", mean);
    }
}
