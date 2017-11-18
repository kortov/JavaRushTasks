package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileInput = reader.readLine();
        String fileOutput = reader.readLine();

        reader.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileInput));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileOutput));


        String inputElement;
        int foundedNumber;
        boolean previousIsNumber = false;
        StringBuilder stringBuilder = new StringBuilder();


        while ((inputElement = bufferedReader.readLine()) != null) {
            /*char testee = (char) inputElement;
            if (Character.isDigit(testee)) {
                previousIsNumber = true;
                stringBuilder.append(testee);
            } else {
                if (previousIsNumber) {
                    previousIsNumber = false;
                    stringBuilder.append(" ");
                }
            }*/


            String splittedStrings[] = inputElement.split(" ");

            for (String splittedString : splittedStrings) {

                try {
                    foundedNumber = Integer.parseInt(splittedString);
                    bufferedWriter.write(foundedNumber + " ");
                } catch (NumberFormatException e) {
                    continue;

                }
            }

        }

        /*String result = stringBuilder.toString().trim();

        bufferedWriter.write(result);*/

        bufferedReader.close();
        bufferedWriter.close();
    }
}
