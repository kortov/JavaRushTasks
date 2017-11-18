package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fis = new FileInputStream(reader.readLine());

        byte[] bytes = new byte[fis.available()];


        for (int i = 0; fis.available() > 0; i++) {
            bytes[i] = (byte) fis.read();
        }


        Set<Byte> set = new TreeSet<>();


        for (byte aByte : bytes) {
            set.add(aByte);
        }

        List<Byte> list = new LinkedList<>();


        for (Byte aByte : set) {
            System.out.print(aByte + " ");
        }


        reader.close();
        fis.close();
    }
}
