package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr1 = new FileReader(reader.readLine());
        BufferedReader fileReader1 = new BufferedReader(fr1);
        FileReader fr2 = new FileReader(reader.readLine());
        BufferedReader fileReader2 = new BufferedReader(fr2);
        collate(fileReader1, fileReader2);
        fr1.close();
        fr2.close();
        reader.close();

    }

    public static void collate(BufferedReader reader1, BufferedReader reader2) throws IOException {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        while (reader1.ready()) {
            list1.add(reader1.readLine());
        }
        while (reader2.ready()) {
            list2.add(reader2.readLine());
        }
        while (list1.size() > 0 && list2.size() > 0) {
            if (list1.get(0).equals(list2.get(0))) {
                lines.add(new LineItem(Type.SAME, list1.get(0)));
                list1.remove(0);
                list2.remove(0);
            } else if (list1.get(0).equals(list2.get(1))) {
                lines.add(new LineItem(Type.ADDED, list2.get(0)));
                list2.remove(0);
            } else if (list2.get(0).equals(list1.get(1))) {
                lines.add(new LineItem(Type.REMOVED, list1.get(0)));
                list1.remove(0);
            }
        }
        if (list1.size() == 1) {
            lines.add(new LineItem(Type.REMOVED, list1.get(0)));
            list1.remove(0);
        } else if (list2.size() == 1) {
            lines.add(new LineItem(Type.ADDED, list2.get(0)));
            list2.remove(0);
        }


    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
