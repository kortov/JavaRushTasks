package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    final static int ID_CHAR_SIZE = 8;
    final static int PRODUCTNAME_CHAR_SIZE = 30;
    final static int PRICE_CHAR_SIZE = 8;
    final static int QUANTITY_CHAR_SIZE = 4;

    public static void main(String[] args) throws Exception {


        String id;
        String productName = null;
        String price = null;
        String quantity = null;
        boolean isReplace = false;


        if ("-d".equals(args[0])) {
            id = args[1];
        } else if ("-u".equals(args[0])) {
            id = args[1];
            productName = args[2];
            price = args[3];
            quantity = args[4];
            isReplace = true;
        } else return;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();

        BufferedReader readerF = new BufferedReader(new FileReader(fileName));
        BufferedWriter writerF = new BufferedWriter(new FileWriter(fileName));
        List<String> strings = new LinkedList<>();


        while (readerF.ready()) {
            String record = readerF.readLine();
            strings.add(record);
        }


        for (int i = 0; i < strings.size(); i++) {
            String string = strings.get(i);
            String idRaw = string.substring(0, ID_CHAR_SIZE);
            long tmpId = Long.valueOf(idRaw.trim());
            Long targerId = Long.valueOf(id);


            if (tmpId != targerId) {
                writerF.write(string);
                if (i != (strings.size() - 1))
                    writerF.write("\n");
            } else {
                if (isReplace) {
                    String newRecord = String.format("%-" + ID_CHAR_SIZE + "s" +
                                    "%-" + PRODUCTNAME_CHAR_SIZE + "." + PRODUCTNAME_CHAR_SIZE + "s" +
                                    "%-" + PRICE_CHAR_SIZE + "s" +
                                    "%-" + QUANTITY_CHAR_SIZE + "s",
                            id, productName, price, quantity);

                    writerF.write(newRecord);
                    if (i != (strings.size() - 1))
                        writerF.write("\n");
                }
            }
        }
        reader.close();
        writerF.close();
        readerF.close();
    }
}








