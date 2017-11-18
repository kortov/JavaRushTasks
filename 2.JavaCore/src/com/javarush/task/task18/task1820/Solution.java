package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputFile = reader.readLine();
        String outputFile = reader.readLine();
        reader.close();

        FileInputStream fis = new FileInputStream(inputFile);

        byte[] bytes = new byte[fis.available()];

        fis.read(bytes);

        fis.close();

        String fileToString = new String(bytes);

        String[] splited = fileToString.split("\\s+");
        FileOutputStream fos = new FileOutputStream(outputFile, true);

        for (String s : splited) {
            Double d = Double.valueOf(s);

            Integer a = (int) Math.round(d);
            fos.write(a.toString().getBytes());
            fos.write(" ".getBytes());
            fos.flush();
        }


        fos.close();

    }
}
