package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        System.out.println(doesTriangleExist(a, b, c )?"Треугольник существует.":"Треугольник не существует.");

    }


    public static boolean doesTriangleExist(int a, int b, int c) {

        if (a + b <= c) {

            return false;
        } else if (c + a <= b) {
            return false;
        } else if (c + b <= a) {
            return false;
        } else {
            return true;
        }
    }
}