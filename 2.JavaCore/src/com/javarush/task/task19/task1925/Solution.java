package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader(args[0]));
        BufferedWriter w = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder sb = new StringBuilder();

        while (r.ready()) {
            String[] words = r.readLine().split(" ");
            for (String word : words)
                if (word.length() > 6)
                    if (sb.length() == 0)
                        sb.append(word);
                    else
                        sb.append("," + word);

        }

        w.write(sb.toString());

        r.close();
        w.close();

    }
}
