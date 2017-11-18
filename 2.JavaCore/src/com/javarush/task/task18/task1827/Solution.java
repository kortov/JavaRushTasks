package com.javarush.task.task18.task1827;

/* 
Прайсы
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


        if (!"-c".equals(args[0])) {
            return;
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();


        BufferedReader readerF = new BufferedReader(new FileReader(fileName));
        BufferedWriter writerF = new BufferedWriter(new FileWriter(fileName));
        List<String> strings = new LinkedList<>();
        List<Long> idList = new LinkedList<>();

        String productName = args[1];
        String price = args[2];
        String quantity = args[3];

        while (readerF.ready()) {
            String record = readerF.readLine();
            strings.add(record);
        }


        for (String string : strings) {
            String idRaw = string.substring(0, ID_CHAR_SIZE);
            long id = Long.valueOf(idRaw.trim());

            idList.add(id);
        }


        long newID = idList.get(idList.size() - 1) + 1;

        String newRecord = String.format("%-" + ID_CHAR_SIZE + "d" +
                        "%-" + PRODUCTNAME_CHAR_SIZE + "." + PRODUCTNAME_CHAR_SIZE + "s" +
                        "%-" + PRICE_CHAR_SIZE + "s" +
                        "%-" + QUANTITY_CHAR_SIZE + "s",
                newID, productName, price, quantity);

        for (String string : strings) {
            writerF.write(string + "\n");
        }

        writerF.write(newRecord);


        writerF.close();
        readerF.close();
        reader.close();
    }
}
