package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        String inputFile = consoleReader.readLine();
        String outputFile = consoleReader.readLine();

        consoleReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outputFile));

//        int input;

        String input = "";
        StringBuilder stringBuilder = new StringBuilder();


        while ((input = fileReader.readLine()) != null) {
            String filteredInput = input.replace('.', '!');
            stringBuilder.append(filteredInput);
        }

//         stringBuilder.replace('.', '!', stringBuilder.toString());


//        fileWriter.write(stringBuilder.toString());

//        String intermediateResult = stringBuilder.toString();
        String result = stringBuilder.toString();

        fileWriter.write(result);
        fileReader.close();
        fileWriter.close();
    }
}
