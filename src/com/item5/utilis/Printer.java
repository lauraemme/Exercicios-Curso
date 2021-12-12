package com.item5.utilis;

public class Printer {

    public static void msgWriteNames (){
        System.out.println("Digite o nome dos 5 convidados: ");
    }

    public static void printLongestName (String[] names){
        String longestName = names[0];
        char[] longestNameChar = longestName.toCharArray();
        String longestName2 = "";

        for (String name: names){
            char[] nameChar = name.toCharArray();

            if (nameChar.length > longestNameChar.length){
                longestName = name;
            }
            else if (nameChar.length == longestNameChar.length){
                longestName2 = name;
            }
        }

        if (longestName2 == ""){
            System.out.println("Há mais de um nome com o maior número de caracteres!");
        }
        else {
            System.out.println("O nome mais longo na lista é " + longestName);
        }
    }
}
