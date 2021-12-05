package com.item2.utils;

import com.item2.service.Calculator;

public class Printer {

    public static void msgReceiveANumber (){
        System.out.print("Insira um número com até 2 casas decimais: ");
    }

    public static void showTimesTable (float num){
        System.out.printf("Tabuada de %.2f: ", num);
        System.out.println();
        System.out.printf("%.2f * 1 = %.2f", num, Calculator.multiplication(num,1f));
        System.out.println();
        System.out.printf("%.2f * 2 = %.2f", num, Calculator.multiplication(num,2f));
        System.out.println();
        System.out.printf("%.2f * 3 = %.2f", num, Calculator.multiplication(num,3f));
        System.out.println();
        System.out.printf("%.2f * 4 = %.2f", num, Calculator.multiplication(num,4f));
        System.out.println();
        System.out.printf("%.2f * 5 = %.2f", num, Calculator.multiplication(num,5f));
        System.out.println();
        System.out.printf("%.2f * 6 = %.2f", num, Calculator.multiplication(num,6f));
        System.out.println();
        System.out.printf("%.2f * 7 = %.2f", num, Calculator.multiplication(num,7f));
        System.out.println();
        System.out.printf("%.2f * 8 = %.2f", num, Calculator.multiplication(num,8f));
        System.out.println();
        System.out.printf("%.2f * 9 = %.2f", num, Calculator.multiplication(num,9f));
        System.out.println();
        System.out.printf("%.2f * 10 = %.2f", num, Calculator.multiplication(num,10f));

    }

}
