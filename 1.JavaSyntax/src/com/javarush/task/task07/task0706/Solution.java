package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] houses = new int[15];
        Scanner scanner = new Scanner(System.in);

        int even = 0, odd = 0;
        for (int i = 0; i < houses.length; i++) {
            houses[i] = scanner.nextInt();
            if (i % 2 == 0) {
                even+= houses[i];
            } else {
                odd += houses[i];
            }
        }

        /*System.out.println("even " +even);
        System.out.println("odd " +odd);*/
        if (even > odd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else if (odd > even) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
