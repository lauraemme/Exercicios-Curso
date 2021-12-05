package com.item2;

import com.item2.utils.Printer;
import com.item2.utils.Reader;

public class Main {

    public static void main(String[] args) {

        float num = Reader.scanNum();

        Printer.showTimesTable(num);
    }
}
