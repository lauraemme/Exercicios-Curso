package com.exercio.conversaotemp.utils;

import com.exercio.conversaotemp.service.Converter;

public class Menu {

    public static int runMenu(int option){

        while (option != 1 && option != 2 && option != 3 && option != 4 )
        {
            System.out.println("Por favor, insira uma opção válida.");
            option = Reader.scanOption();
        }

        switch (option){
            case 1:
                float fahrenheitTemp = Converter.toFahrenheit();
                Printer.showFarenheitTemp(fahrenheitTemp);
                break;
            case 2:
                float kelvinTemp = Converter.toKelvin();
                Printer.showKelvinTemp(kelvinTemp);
                break;
            case 3:
                float reaumurTemp = Converter.toReaumur();
                Printer.showReaumurTemp(reaumurTemp);
                break;
            case 4:
                float rankineTemp = Converter.toRankine();
                Printer.showRankineTemp(rankineTemp);
                break;
        }

        int continuesOption;
        Printer.msgContinueOperation();
        continuesOption = Reader.scanOption();

        return continuesOption;
    }

}
