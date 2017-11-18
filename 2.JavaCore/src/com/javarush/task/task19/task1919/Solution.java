package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> map = new TreeMap<>();
        FileReader fileReader = new FileReader(args[0]);

        BufferedReader rd = new BufferedReader(fileReader);

        String[] analyzedString;
        String line;
        Double currentValue;

        while ((line = rd.readLine()) != null) {
            analyzedString = line.split(" ");

            final String key = analyzedString[0];
            final double value = Double.parseDouble(analyzedString[1]);
            if (map.containsKey(key)) {
                currentValue = map.get(key);
                map.put(key, value + currentValue);
            } else {
                map.put(key, value);
            }
        }

        //rd.close();
        fileReader.close();

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
