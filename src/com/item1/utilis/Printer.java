package com.item1.utilis;

public class Printer {

    public static void msgFruitName (){
        System.out.println("Digite o nome de 5 frutas: ");
    }

    public static void showArray (String[] array){
        System.out.println();
        System.out.println("Carrinho de compras:");
        for(String item: array){
            System.out.println(item);
        }
    }
}
