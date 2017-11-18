package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/
//,,,,,

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedInputStream bis = null;

        try {
            FileInputStream fis = new FileInputStream(reader.readLine());
            bis = new BufferedInputStream(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        int counter = 0;
        try {
            while (bis.available() > 0) {

                if (bis.read() == 44) {
                    counter++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(counter);
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
