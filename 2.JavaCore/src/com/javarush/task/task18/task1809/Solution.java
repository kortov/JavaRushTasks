package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = null;
        String fileName2 = null;

        fileName1 = reader.readLine();
        fileName2 = reader.readLine();

        FileInputStream fis = new FileInputStream(fileName1);

        FileOutputStream fos = new FileOutputStream(fileName2);

        byte[] file1 = new byte[fis.available()];

        fis.read(file1);

        for (int i = file1.length - 1; i >= 0; i--) {
            fos.write(file1[i]);
        }

        reader.close();
        fis.close();
        fos.close();
    }
}
