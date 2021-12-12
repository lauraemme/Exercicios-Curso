package com.item7.utilis;

import com.item7.Person;

public class Printer {

    public static void msg (){
        System.out.println("Digite o nome e a idade de 5 pessoas");
    }

    public static void msgWriteName (int num){
        System.out.println("Digite o nome da pessoa " + num +": ");
    }

    public static void msgWriteAge (int num){
        System.out.println("Digite a idade da pessoa " + num +": ");
    }

    public static void showResults (Person olderPerson, Person youngerPerson, float avaregeAge){
        System.out.println();
        System.out.println("Análise da lista de pessoas informadas");

        if (olderPerson.name == ""){
            System.out.println("Não existe apenas uma pessoa mais velha");
        } else{
            System.out.println("Pessoa mais velha: " + olderPerson.name + " " + olderPerson.age + " anos.");
        }

        if (youngerPerson.name == ""){
            System.out.println("Não existe apenas uma pessoa mais nova");
        } else {
            System.out.println("Pessoa mais nova: " + youngerPerson.name + " " + youngerPerson.age + " anos.");
        }

        System.out.printf("Média das idades: %.2f", avaregeAge);
    }
}
