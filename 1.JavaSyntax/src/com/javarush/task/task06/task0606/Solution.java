package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int length = String.valueOf(target).length();
        for (int i = 0; i < length; i++) {
           int remainder =  target %10;
            if (remainder % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            target /=10;
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
