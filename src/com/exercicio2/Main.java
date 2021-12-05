package com.exercicio2;

import com.exercicio2.service.Calculator;
import com.exercicio2.utils.Printer;
import com.exercicio2.utils.Reader;

import java.util.Scanner;

public class Main {1

    public static void main(String[] args) {

        int num1 = Reader.scanNum();
        int num2 = Reader.scanNum();

        int sum = Calculator.sum(num1, num2);
        int subtraction = Calculator.subtraction(num1, num2);
        int multiplication = Calculator.multiplication(num1, num2);

        float num1Float = num1;
        float num2Float = num2;
        float division = Calculator.division(num1Float, num2Float);

        Printer.showResults(sum, subtraction, multiplication, division);
    }
}
