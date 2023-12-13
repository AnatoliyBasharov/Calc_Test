package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("Введите арифметическую операцию");
        String input = scanner.nextLine();
        calc(input);

    }

    public static String calc(String input) throws IOException {

        String[] array = input.split(" ");
        int numberOne = Integer.parseInt(array[0]);
        int numberTwo = Integer.parseInt(array[2]);
        if (numberOne < 1 || numberOne > 10 || numberTwo < 1 || numberTwo > 10) {
            throw new IOException("Введено некорректное число");
        }
        String symbol = array[1];
        if (symbol.length() != 1 || !"+-*/".contains(symbol)) {
            throw new IOException("Введен некорректный символ");
        }
        if (array.length != 3) {
            throw new IOException("Введена некорректная операция ");
        }
        int sum = 0;

        if (symbol.equals("+")) {
            sum = numberOne + numberTwo;
        }
        if (symbol.equals("-")) {
            sum = numberOne - numberTwo;
        }
        if (symbol.equals("*")) {
            sum = numberOne * numberTwo;
        }
        if (symbol.equals("/")) {
            sum = numberOne / numberTwo;
        }
        String sumToString = Integer.toString(sum);
        System.out.println(sum);
        return sumToString;
    }
}