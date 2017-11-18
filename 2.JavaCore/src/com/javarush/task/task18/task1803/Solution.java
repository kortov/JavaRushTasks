package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fis = new FileInputStream(reader.readLine());

        byte[] bytes = new byte[fis.available()];


        for (int i = 0; fis.available() > 0; i++) {
            bytes[i] = (byte) fis.read();
        }

        Map<Byte, Integer> map = new HashMap<>();

        for (byte aByte : bytes) {
            Integer freq = map.get(aByte);
            map.put(aByte, freq == null ? 1 : ++freq);
        }

        List<Byte> list = new LinkedList<>();
        Byte[] maxBytes = new Byte[map.keySet().size()];


        int maxRepeat = 0;
        for (Map.Entry<Byte, Integer> byteIntegerEntry : map.entrySet()) {
            if (byteIntegerEntry.getValue() > maxRepeat) {
                maxRepeat = byteIntegerEntry.getValue();
            }
        }
        for (Map.Entry<Byte, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxRepeat) {
                list.add(entry.getKey());
            }
        }


        for (Byte aByte : list) {
            System.out.print(aByte + " ");
        }

//        if (bytes.length != 0) {
//            System.out.println(bytes[bytes.length - 1]);
//        }

        reader.close();
        fis.close();
    }
}
