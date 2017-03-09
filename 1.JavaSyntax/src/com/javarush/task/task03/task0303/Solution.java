package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(50, 3.4));
        System.out.println(convertEurToUsd(29, 2.9));
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        return eur * course;
    }
}
