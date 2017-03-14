package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    static BufferedReader consoleReader;

    static BufferedReader fileReaderAll;
    static BufferedReader fileReaderRemove;

    static String fileNameAll;
    static String fileNameRemove;

    public static void main(String[] args) {

        consoleReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            fileNameAll = consoleReader.readLine();
            fileNameRemove = consoleReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fileReaderAll = new BufferedReader(new FileReader(fileNameAll));
            fileReaderRemove = new BufferedReader(new FileReader(fileNameRemove));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            String current = null;
            while ((current = fileReaderAll.readLine()) != null) {
                allLines.add(current);
            }

            while ((current = fileReaderRemove.readLine()) != null) {
                forRemoveLines.add(current);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Solution solution = new Solution();
        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }

        try {
            consoleReader.close();
            fileReaderAll.close();
            fileReaderRemove.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public synchronized void joinData() throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
