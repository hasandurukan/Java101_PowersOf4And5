package com.java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Please type a number :");
        int number = input.nextInt();
        int powersOf4 = 1, powersOf5 = 1;
        String resultPrinter = "";
        for (int i = 4; i < number; i++) {
            powersOf4=1;
            powersOf5=1;
            while (powersOf4 < i && powersOf5 < i) {
                powersOf4 *= 4;
                powersOf5 *= 5;
                if (powersOf4 == i || powersOf5 == i) {
                    resultPrinter += i + ",";
                }
            }
        }

        System.out.print(resultPrinter.substring(0,resultPrinter.length()-1));
    }
}
