package com.item2.utilis;

public class Printer {

    public static void msgName (){
        System.out.println("Digite uma palavra: ");
    }

    public static void showWordInReverse (String word){
        char[] wordLetters = word.toCharArray();
        String wordInReverse = "";

        for (int i = wordLetters.length - 1; i >= 0; i--){
            wordInReverse += Character.toLowerCase(wordLetters[i]);
        }

        System.out.println(wordInReverse);;
    }
}
