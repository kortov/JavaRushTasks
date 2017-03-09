package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код

        HashMap<String, Integer> map = new HashMap<>();

            map.put("a", 400);
            map.put("b", 4000);
            map.put("c", 40);
            map.put("d", 300);
            map.put("e", 600);
            map.put("f", 50);
            map.put("g", 50);
            map.put("h", 666);
            map.put("i", 50);
            map.put("j", 50);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();

            if ((int)entry.getValue() < 500) {
                iterator.remove();
            }
        }


    }


    public static void main(String[] args) {

        HashMap<String, Integer> map = createMap();
        removeItemFromMap(map);

    }
}