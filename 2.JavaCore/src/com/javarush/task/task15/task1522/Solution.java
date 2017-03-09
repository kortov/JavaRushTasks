package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Закрепляем Singleton pattern
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {

        readKeyFromConsoleAndInitPlanet();
    }


    public static void readKeyFromConsoleAndInitPlanet() {
        Scanner sc = new Scanner(System.in);
        // implement step #5 here - реализуйте задание №5 тут


            String input = sc.nextLine();
            switch (input) {
                case Planet.EARTH:
                    thePlanet = Earth.getInstance();
                    return;
                case Planet.SUN:
                    thePlanet = Sun.getInstance();
                    return;
                case Planet.MOON:
                    thePlanet = Moon.getInstance();
                    return;
                default:
                    thePlanet = null;
            }

    }
}
