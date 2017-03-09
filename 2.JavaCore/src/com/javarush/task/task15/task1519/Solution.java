package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        Scanner sc = new Scanner(System.in);


        do {
            String input = sc.nextLine();
            if (input.equals("exit")) {
//                print(input);
                break;
            } else if (input.contains(".")) {
                try {
                    Double d = Double.parseDouble(input);
                    print(d);
                } catch (NumberFormatException e) {
                    print(input);
                }

            } else {
                try {
                    int value = Integer.parseInt(input);
                    if (value >= 128 || value <= 0) {
                        print(value);
                    } else {
                        short sh = (short)value;
                        print(sh);
                    }
                } catch (NumberFormatException e) {
                    print(input);
                }

            }

        }
        while (true);
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
