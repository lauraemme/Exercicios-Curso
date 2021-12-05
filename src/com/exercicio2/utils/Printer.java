package com.exercicio2.utils;

public class Printer {

    public static void msgReceiveANumber (){
        System.out.print("Insira um número inteiro: ");
    }

    public static void showResults (int sum, int subtraction, int multiplication, float division){
        System.out.println("Soma: " + sum);
        System.out.println("Subtração: " + subtraction);
        System.out.println("Multiplicação: " + multiplication);
        System.out.printf("Divisão: %.2f", division);
    }

}
