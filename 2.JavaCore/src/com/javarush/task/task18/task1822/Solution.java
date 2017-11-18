package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fis = new FileInputStream(reader.readLine());

        byte[] bytes = new byte[fis.available()];
        fis.read(bytes);
        String string = new String(bytes);

        String[] strings = string.split("\\n");

        for (String s : strings) {
            if (s.startsWith(args[0])) {
                System.out.println(s);
            }
        }
        reader.close();
        fis.close();
    }
}
