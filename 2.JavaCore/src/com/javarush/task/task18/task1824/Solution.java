package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = null;

        try {
            while (true) {

                try {
                    fileName = reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                FileInputStream fis = new FileInputStream(fileName);
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println(fileName);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


}

