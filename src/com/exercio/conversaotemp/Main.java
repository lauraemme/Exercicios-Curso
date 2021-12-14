package com.exercio.conversaotemp;

import com.exercio.conversaotemp.utils.Menu;
import com.exercio.conversaotemp.utils.Printer;
import com.exercio.conversaotemp.utils.Reader;

public class Main {

    public static void main(String[] args){

        Printer.msgCoverterinitialized();

        int menuOption;
        int continuesOption = 1;

        while ( continuesOption != 0){
            Printer.msgMenuOptions();
            menuOption = Reader.scanOption();

            continuesOption = Menu.runMenu(menuOption);
        }

        Printer.msgConverterClosed();
        Reader.closeScan();
    }

}
