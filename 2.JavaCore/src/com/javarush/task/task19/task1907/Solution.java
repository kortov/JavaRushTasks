package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();

        reader.close();

        FileReader fileReader = new FileReader(fileName);


        StringBuilder stringBuilder = new StringBuilder();


        while (fileReader.ready()) {
            stringBuilder.append((char) fileReader.read());
        }
        int counter = 0;


        Pattern pattern = Pattern.compile("(?<=(\\s|\\W))world(?=(\\s|\\W))");
        Matcher m = pattern.matcher(stringBuilder);
        while (m.find()) {
            counter++;
        }


        System.out.println(counter);

        fileReader.close();


    }
}
