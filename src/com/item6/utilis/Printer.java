package com.item6.utilis;

public class Printer {

    public static void msgWriteWord (){
        System.out.println("Digite uma palavra: ");
    }

   public static void showOddUpperChars (String word){
        char[] wordChars = word.toCharArray();
        String oddUpperChars = "";

        for (int i = 0; i < wordChars.length; i++){
            if ( i % 2 == 0){
                oddUpperChars += Character.toUpperCase(wordChars[i]);
            }
        }

       System.out.println("Caracteres ímpares em maiúscula: " + oddUpperChars);
   }
}
