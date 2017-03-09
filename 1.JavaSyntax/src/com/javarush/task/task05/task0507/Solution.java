package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int sum = 0;
        int counter = 0;
        double average = 0.0;
        while (true) {
            a = scanner.nextInt();
            if (a == -1) {
                break;
            }
            sum += a;
            counter++;
        }
        System.out.println(sum*1.0/counter);
    }
}

