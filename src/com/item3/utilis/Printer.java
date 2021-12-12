package com.item3.utilis;

public class Printer {

    public static void msgWriteNumber (){
        System.out.println("Digite 5 números inteiros: ");
    }

    public static void printOddAndEvenNumbers (int[] array){
        String oddNumbers = "";
        String evenNumbers = "";

        for (int num: array){
            if (num % 2 == 0){
                evenNumbers += String.valueOf(num);
                evenNumbers += " ";
            }
            else{
                oddNumbers += String.valueOf(num);
                oddNumbers += " ";
            }
        }

        System.out.println("Números ímpare: " + oddNumbers);
        System.out.println("Números pares: " + evenNumbers);
    }
}
