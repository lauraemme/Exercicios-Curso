package com.item7;

import com.item7.service.Calculator;
import com.item7.utilis.Printer;
import com.item7.utilis.Reader;

public class Item7 {

    public static void main(String[] args) {

        Printer.msg();

        Person[] people = new Person[5];

        for (int i = 0; i < people.length; i++ ){
            Printer.msgWriteName(i + 1);
            String name = Reader.scanName();

            Printer.msgWriteAge(i + 1);
            int age = Reader.scanAge();

            people[i] = new Person(name,age);
        }

        Reader.closeScan();

        Person olderPerson = Calculator.olderPerson(people);
        Person youngerPerson = Calculator.youngerPerson(people);
        float averageAge = Calculator.averageAge(people);

        Printer.showResults(olderPerson, youngerPerson, averageAge);

    }
}
