package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {

    static FileInputStream inputStream;
    static FileOutputStream outputStream;

    public static void main(String[] args) throws IOException {
        inputStream = new FileInputStream(args[1]);
        outputStream = new FileOutputStream(args[2]);

        switch (args[0]) {
            case "-e":
                encrypt();
                break;
            case "-d":
                decrypt();
                break;
            default:
                break;
        }

        inputStream.close();
        outputStream.close();
    }


    private static void encrypt() throws IOException {
        while (inputStream.available() > 0) {
            int input = inputStream.read();
            outputStream.write(++input);
        }

    }

    private static void decrypt() throws IOException {
        while (inputStream.available() > 0) {
            int input = inputStream.read();
            outputStream.write(--input);
        }
    }
}
