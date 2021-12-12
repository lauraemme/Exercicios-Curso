package com.item1;

import com.item1.utilis.Printer;
import com.item1.utilis.Reader;

public class Item1 {

    public static void main (String[] args){

        String[] shoppingCart = new String[5];

        Printer.msgFruitName();
        for (int i = 0; i < shoppingCart.length; i++){
            shoppingCart[i] = Reader.scanFruit();
        }

        Reader.closeScan();
        Printer.showArray(shoppingCart);
    }
}
