package com.item5;

import com.item5.utilis.Printer;
import com.item5.utilis.Reader;

public class Item5 {

    public static void main(String[] args) {

        String[] guests = new String[5];

        Printer.msgWriteNames();
        for(int i = 0; i < guests.length; i++){
            guests[i] = Reader.scanName();
        }

        Reader.closeScan();

        Printer.printLongestName(guests);
    }
}
