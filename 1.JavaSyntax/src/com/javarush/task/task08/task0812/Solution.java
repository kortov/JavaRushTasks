package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 10; ++i) {
            list.add(scanner.nextInt());
        }

        int[] numbers = new int[list.size()];
        int[] lengths = new int[numbers.length];
        numbers[0] = list.get(0);
        int max = 0;

        for(int i = 0; max < list.size(); ++max) {
            if(numbers[i] == list.get(max)) {
                ++lengths[i];
            } else {
                i++;
                numbers[i] = list.get(max);
                lengths[i]++;
            }
        }

        max = lengths[0];

        for(int i = 0; i < lengths.length; ++i) {
            if(lengths[i] > max) {
                max = lengths[i];
            }
        }

        System.out.println(max);
    }
}