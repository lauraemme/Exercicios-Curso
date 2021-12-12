package com.item8.utilis;


public class Printer {

    public static void msg (){
        System.out.println("Digite o nome, o peso e a altura de 5 pessoas");
    }

    public static void msgWriteName (int num){
        System.out.println("Digite o nome da pessoa " + num +": ");
    }

    public static void msgWriteWeight (int num){
        System.out.println("Digite o peso da pessoa " + num +": ");
    }

    public static void msgWriteHeight (int num){
        System.out.println("Digite a altura da pessoa " + num +": ");
    }

    public static void msgIMCIsNotIdeal (String name){
        System.out.println();
        System.out.println(name + " não está no peso ideal.");
    }

    public static void msgAllIMCIareIdeal (){
        System.out.println();
        System.out.println("Parabéns! Todos estão no peso ideal!");
    }
}
