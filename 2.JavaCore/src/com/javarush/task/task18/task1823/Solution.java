package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String fileName = null;
            try {
                fileName = reader.readLine();
                if ("exit".equals(fileName)) {
                    break;
                }
                ReadThread thread = new ReadThread(fileName);
                thread.start();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class ReadThread extends Thread {
        FileInputStream fileInputStream;
        int[] ints = new int[256];
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;

        }

        @Override
        public void run() {
            try {
                fileInputStream = new FileInputStream(fileName);

                while (fileInputStream.available() > 0) {
                    int index = fileInputStream.read();
                    ints[index] += 1;
                }

                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            int maxFrq = ints[0];
            int maxFrqIndex = 0;


            for (int i = 0; i < ints.length; i++) {
                if (ints[i] > maxFrq) {
                    maxFrq = ints[i];
                    maxFrqIndex = i;
                }
            }

            resultMap.put(fileName, maxFrqIndex);

        }


    }
}
