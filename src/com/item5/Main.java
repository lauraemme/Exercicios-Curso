package com.item5;

import com.item5.service.Converter;
import com.item5.utils.Printer;
import com.item5.utils.Reader;

public class Main {

    public static void main(String[] args) {

        float inchValue = Reader.scanInchValue();

        float cmValue = Converter.inchToCm(inchValue);

        Printer.showCmValue(cmValue);

    }
}
