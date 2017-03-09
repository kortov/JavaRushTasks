package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {

            list.add(scanner.next());
        }

        int minSize = list.get(0).length(), minIndex = 0, maxSize = list.get(0).length(), maxIndex = 0;


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < minSize) {
                minSize = list.get(i).length();
                minIndex = i;
            } else if (list.get(i).length() > maxSize) {
                maxSize = list.get(i).length();
                maxIndex = i;
            }
        }

        if (minIndex < maxIndex) {
            System.out.println(list.get(minIndex));
        } else {
            System.out.println(list.get(maxIndex));
        }
    }
}
