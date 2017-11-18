package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fis = new FileInputStream(reader.readLine());

        byte[] bytes = new byte[fis.available()];


        for (int i = 0; fis.available() > 0; i++) {
            bytes[i] = (byte) fis.read();
        }


        Arrays.sort(bytes);

        if (bytes.length != 0) {
            System.out.println(bytes[0]);
        }

        reader.close();
        fis.close();
    }
}
