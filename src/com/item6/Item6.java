package com.item6;

import com.item6.utilis.Printer;
import com.item6.utilis.Reader;

public class Item6 {

    public static void main (String[] args){

        Printer.msgWriteWord();

        String word = Reader.scanWord();
        Reader.closeScan();

        Printer.showOddUpperChars(word);
    }
}
