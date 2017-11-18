package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = null;
        String file2 = null;
        String file3 = null;
        try {
            file1 = reader.readLine();
            file2 = reader.readLine();
            file3 = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileInputStream fis = new FileInputStream(file1);

        int file1Size = fis.available();
        byte[] buffer1 = new byte[file1Size / 2];
        byte[] buffer2 = new byte[file1Size - buffer1.length];


        FileOutputStream fos2 = new FileOutputStream(file2);
        FileOutputStream fos3 = new FileOutputStream(file3);
        int count = fis.read(buffer2);
        fos2.write(buffer2, 0, count);


        int count2 = fis.read(buffer1);
        fos3.write(buffer1, 0, count2);


        reader.close();
        fis.close();
        fos2.close();
        fos3.close();

    }
}
