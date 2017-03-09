package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        calculate(scanner.nextDouble());
    }

    public static void calculate(double minutes) {
        int times = (int)minutes / 5;
        double interval = minutes - times* 5;

        if (interval >= 0.0 && interval < 3.0) {
            System.out.println("зелёный");
        } else if (interval >= 3.0 && interval < 4.0) {
            System.out.println("желтый");
        } else if (interval >= 4.0 && interval < 5) {
            System.out.println("красный");
        }

    }

}