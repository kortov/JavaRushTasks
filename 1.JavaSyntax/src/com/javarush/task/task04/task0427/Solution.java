package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        doSomething();
    }

    public static void doSomething() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        if (a < 1 || a > 999) {

            return;
        } else if (a % 2 == 0) {
            System.out.print("четное ");
        } else if (a % 2 != 0) {
            System.out.print("нечетное ");
        }
        String b = String.valueOf(a);
        if (b.length() == 1) {
            System.out.println("однозначное число");
        } else if (b.length() == 2) {
            System.out.println("двузначное число");
        } else if (b.length() == 3) {
            System.out.println("трехзначное число");
        }
    }
}
