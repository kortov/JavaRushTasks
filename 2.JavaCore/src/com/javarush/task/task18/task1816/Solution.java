package com.javarush.task.task18.task1816;

/*
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        fis = new FileInputStream(args[0]);


//        List<Integer> list = new LinkedList<>();

        int counter = 0;
        while (fis.available() > 0) {
            int symbol = fis.read();
            if ((64 < symbol && symbol < 91) || (96 < symbol && symbol < 123)) {
                counter++;
            }
        }

        System.out.println(counter);
        fis.close();
    }
}
