package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        boolean flag = false;
        for (int i = 0; i < array.length && !flag; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    flag = true;
                    System.out.print(array[j] + " ");
                }
            }

            if (flag) {
                System.out.print(array[i]);
            }
        }
    }
}