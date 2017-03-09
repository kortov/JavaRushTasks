package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {

        public static FileReader fileReader;
        BufferedReader reader;
        StringBuilder stringBuilder = new StringBuilder();

        @Override
        public void setFileName(String fullFileName) {
            try {
                fileReader = new FileReader(fullFileName);
                reader = new BufferedReader(fileReader);
            } catch (FileNotFoundException e) {
            }
        }

        @Override
        public String getFileContent() {
            return stringBuilder.toString();

        }

        @Override
        public void run() {

            String currentLine;
            try {
                while ((currentLine = reader.readLine()) != null) {
                    stringBuilder.append(currentLine + " ");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    //add your code here - добавьте код тут
}
