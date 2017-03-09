package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int positiveCounter = 0, negativeCounter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveCounter++;
            } else if (arr[i] < 0) {
                negativeCounter++;
            }
        }

        System.out.println("количество отрицательных чисел: "+negativeCounter);
        System.out.println("количество положительных чисел: "+positiveCounter);
    }
}
