package com.exercio.conversaotemp;

import com.exercio.conversaotemp.service.Converter;
import com.exercio.conversaotemp.utils.Printer;
import com.exercio.conversaotemp.utils.Reader;

public class Main {

    public static void main(String[] args){

        float celsiusTemperature = Reader.scanTemp();

        float fahrenheitTemperature = Converter.toFarenheit(celsiusTemperature);

        float kelvinTemperature = Converter.toKelvin(celsiusTemperature);

        float reaumurTemperature = Converter.toReaumur(celsiusTemperature);

        float rankineTemperature = Converter.toRankine(celsiusTemperature);

        Printer.showResults(fahrenheitTemperature, kelvinTemperature, reaumurTemperature, rankineTemperature);
    }

}
