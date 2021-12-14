package com.exercio.conversaotemp.utils;

public class Printer {

    public static void msgCoverterinitialized(){
        System.out.println();
        System.out.println("============ Conversor de temperatura inicializado ==========");
    }

    public static void msgConverterClosed (){
        System.out.println();
        System.out.println("============ Conversor de temperatura encerrado ==========");
    }

    public static void msgReceiveCelsiusTemp (){
        System.out.println();
        System.out.print("Insira uma temperatura em Celsius: ");
    }

    public static void msgMenuOptions (){
        System.out.println();
        System.out.println("===== Menu =====");
        System.out.println("Digite a opção desejada de conversão");
        System.out.println("1 –> converter para Fahrenheit");
        System.out.println("2 –> converter para Kelvin");
        System.out.println("3 –> converter para Réaumur");
        System.out.println("4 –> converter para Rankine");
        System.out.print("Opção: ");
    }

    public static void msgContinueOperation (){
        System.out.println();
        System.out.println();
        System.out.print("Se deseje sair digite 0. " +
                "Caso queira realizar uma nova conversão, digite qualquer outro número inteiro: ");
    }


    public static void showFarenheitTemp (float fahrenheitTemp){
        System.out.println();
        System.out.println("===== Resultado da conversão =====");
        System.out.printf("Fahrenheit: %.2fªF",fahrenheitTemp);
    }

    public static void showKelvinTemp (float kelvinTemp){
        System.out.println();
        System.out.println("===== Resultado da conversão =====");
        System.out.printf("Kelivn: %.2fK",kelvinTemp);
    }

    public static void showReaumurTemp (float reaumurTemp){
        System.out.println();
        System.out.println("===== Resultado da conversão =====");
        System.out.printf("Réaumur: %.2fªr", reaumurTemp);
    }

    public static void showRankineTemp (float rankineTemp){
        System.out.println();
        System.out.println("===== Resultado da conversão =====");
        System.out.printf("Rankine: %.2fªRa",rankineTemp);
    }
}
