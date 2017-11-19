package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(args[0]));
        BufferedWriter out = new BufferedWriter(new FileWriter(args[1]));

        while (in.ready()) {
            String[] readerWord = in.readLine().split(" ");
            for (int i = 0; i < readerWord.length; i++) {
                if (readerWord[i].matches(".*\\d.*")) {
                    out.write(readerWord[i] + " ");
                }
            }
        }
        in.close();
        out.close();
    }
}

