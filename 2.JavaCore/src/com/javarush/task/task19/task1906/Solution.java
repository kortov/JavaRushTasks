package com.javarush.task.task19.task1906;

/* 
Четные байты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String readerName = bufferedReader.readLine();
        String writerName = bufferedReader.readLine();
        FileReader fileReader = new FileReader(readerName);
        FileWriter fileWriter = new FileWriter(writerName);
        fileReader.close();
        int i = 0;
        while (fileReader.ready()) {
            i++;
            int data = fileReader.read();
            if (i % 2 == 0) {
                fileWriter.write(data);
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
