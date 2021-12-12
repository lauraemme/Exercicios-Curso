package com.item8;

import com.item8.Person;
import com.item8.utilis.Printer;

public class Compare {

    public static void imcComparator (Person[] people){
        String personIMCNotIdeal = "";

        for (Person person: people){
            if (person.calculateIMC() < 18.5f || person.calculateIMC() > 25f){
                Printer.msgIMCIsNotIdeal(person.getName());
                personIMCNotIdeal = person.getName();
            }
        }

        if(personIMCNotIdeal == "") Printer.msgAllIMCIareIdeal();
    }
}
