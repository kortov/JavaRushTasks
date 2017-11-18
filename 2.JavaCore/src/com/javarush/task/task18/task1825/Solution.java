package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = null;
        List<String> fileNames = new LinkedList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedOutputStream outputStream = null;
        BufferedInputStream inputStream = null;
        byte[] bytes = null;

        while (!"end".equals(fileName = reader.readLine())) {
            fileNames.add(fileName);
        }

        Collections.sort(fileNames);
        int lastDotIndex = fileNames.get(0).lastIndexOf('.');
        String completeFileName = fileNames.get(0).substring(0, lastDotIndex);


        try {
            outputStream = new BufferedOutputStream(new FileOutputStream(completeFileName, true));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (String name : fileNames) {
            try {
                inputStream = new BufferedInputStream(new FileInputStream(name));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }


            bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            inputStream.close();


            outputStream.write(bytes);
            outputStream.flush();


        }

        outputStream.close();
        reader.close();


    }
}
