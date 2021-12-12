package com.item8;

import com.item8.utilis.Printer;
import com.item8.utilis.Reader;

public class Item8 {

    public static void main(String[] args) {
        Printer.msg();

        Person[] people = new Person[5];

        for (int i = 0; i < people.length; i++ ){
            Printer.msgWriteName(i + 1);
            String name = Reader.scanName();

            Printer.msgWriteHeight(i + 1);
            float height = Reader.scanHeight();

            Printer.msgWriteWeight(i + 1);
            float weight = Reader.scanWeight();

            people[i] = new Person(name, height, weight);
        }

        Reader.closeScan();

        Compare.imcComparator(people);
    }
}
