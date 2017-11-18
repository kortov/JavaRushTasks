package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {


        FileInputStream fis = new FileInputStream(args[0]);

        Map<Character, Integer> map = new TreeMap<>();

        while (fis.available() > 0) {
            char ch = (char) fis.read();
            Integer freq = map.get(ch);
            map.put(ch, freq == null ? 1 : freq + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        fis.close();
    }
}
