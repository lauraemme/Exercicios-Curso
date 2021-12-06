package com.item4;

import com.item4.service.Converter;
import com.item4.utils.Printer;
import com.item4.utils.Reader;

public class Main {

    public static void main(String[] args) {

        Printer.msgReceiveDollarQuote();
        float dollarQuote = Reader.scanner();

        Printer.msgReceiveReaisValue();
        float reaisValue = Reader.scanner();

        float dollarValue = Converter.reaisToDollar(dollarQuote, reaisValue);

        Printer.showDollarValue(reaisValue, dollarValue);

    }
}
