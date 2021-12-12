package com.item2;

import com.item2.utilis.Printer;
import com.item2.utilis.Reader;

public class Item2 {

    public static void main (String[] args){

        Printer.msgName();

        String word = Reader.scanWord();

        Reader.closeScan();

        Printer.showWordInReverse(word);
    }
}
