package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;
//import java.math.RoundingMode;
//import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(args[0]);

        float allSymbols = 0;
        float spaceSymbolCount = 0;

        while (fis.available() > 0) {
            int symbol = fis.read();

            if (Character.isWhitespace(symbol)) {
                spaceSymbolCount++;
            }
            allSymbols++;

        }
        //aajjjjjjjjjjjjjjjjjjjojojojojo

//        DecimalFormat df = new DecimalFormat("#.00");
//        df.setRoundingMode(RoundingMode.HALF_UP);
//        System.out.println(df.format(spaceSymbolCount * 1.00/englishSymbolsCount * 100));
        System.out.println(String.format("%.2f", spaceSymbolCount / allSymbols * 100));
        fis.close();

    }
}
