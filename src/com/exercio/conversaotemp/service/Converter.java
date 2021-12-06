package com.exercio.conversaotemp.service;

public class Converter {

    public static float toFarenheit (float celsiusTemp){
        return (celsiusTemp * 1.8f) + 32f;
    }

    public static float toKelvin (float celsiusTemp){
        return celsiusTemp +273.15f ;
    }

    public static float toReaumur (float celsiusTemp){
        return celsiusTemp * 0.8f;
    }

    public static float toRankine (float celsiusTemp){
        float kelvinTemp = toKelvin(celsiusTemp);
        return kelvinTemp * 1.8f;
    }

}
