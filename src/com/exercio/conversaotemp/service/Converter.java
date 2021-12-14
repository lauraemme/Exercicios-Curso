package com.exercio.conversaotemp.service;

import com.exercio.conversaotemp.utils.Printer;
import com.exercio.conversaotemp.utils.Reader;

public class Converter {

    public static float toKelvin (float celsiusTemp){
        return celsiusTemp + 273.15f ;
    }

    public static void anlyzesAbsoluteZero (float celsiusTemp){

        if(toKelvin(celsiusTemp) <= 0.00f){
            System.out.println("Cuidado atingiu o zero absluto 0ºK!");
        } else if ( toKelvin(celsiusTemp) > 0 || toKelvin(celsiusTemp) < 50 ){
            System.out.println("Cuidado está temperatura está próxima do zero absoluto 0ªK!");
        }
    }

    public static float toKelvin (){
        Printer.msgReceiveCelsiusTemp();
        float celsiusTemp = Reader.scanTemp();

        anlyzesAbsoluteZero(celsiusTemp);

        return celsiusTemp +273.15f ;
    }

    public static float toFahrenheit (){
        Printer.msgReceiveCelsiusTemp();
        float celsiusTemp = Reader.scanTemp();

        anlyzesAbsoluteZero(celsiusTemp);

        return (celsiusTemp * 1.8f) + 32f;
    }

    public static float toReaumur (){
        Printer.msgReceiveCelsiusTemp();
        float celsiusTemp = Reader.scanTemp();

        anlyzesAbsoluteZero(celsiusTemp);

        return celsiusTemp * 0.8f;
    }

    public static float toRankine (){
        Printer.msgReceiveCelsiusTemp();
        float celsiusTemp = Reader.scanTemp();
        float kelvinTemp = toKelvin(celsiusTemp);

        anlyzesAbsoluteZero(celsiusTemp);

        return kelvinTemp * 1.8f;
    }

}
