package com.item3;

import com.item3.service.Converter;
import com.item3.utils.Printer;
import com.item3.utils.Reader;

public class Main {

    public static void main(String[] args) {

        float celsiusTemp = Reader.scanCelsiusTemp();

        float farenheitTemp = Converter.toFarenheit(celsiusTemp);

        Printer.showResult(celsiusTemp, farenheitTemp);

    }
}
