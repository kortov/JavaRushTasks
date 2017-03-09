package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Парсер реквестов
*/

public class
Solution {
    public static void main(String[] args) throws URISyntaxException {
        //add your code here
        Scanner scanner = new Scanner(System.in);
        URI uri = new URI(scanner.next());
        LinkedHashMap map = new LinkedHashMap();
        List<List> lists = new ArrayList<List>();


        Pattern pattern = Pattern.compile("([^?=&]+)(=([^&]*))?");
        Matcher matcher = pattern.matcher(uri.toString());

        while (matcher.find()) {
//            map.put(matcher.group(1), matcher.group(3));
            lists.add(Arrays.asList(matcher.group(1), matcher.group(3)));
        }


        if (lists.iterator().hasNext()) {
            lists.remove(0);
            printList(lists);
        }


//        if (map.keySet().iterator().hasNext()) {
//
//            map.remove(map.keySet().iterator().next());
//            System.out.println("Map " + map);
//            printMap(map);
//        }

    }

    public static void printList(List<List> list) {
        Iterator<List> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next().get(0) + " ");
        }

        iterator = list.iterator();
        while (iterator.hasNext()) {

            List arList = iterator.next();
            if (arList.get(0).equals("obj")) {
                String string = (String)arList.get(1);
                try {
                    alert(Double.parseDouble(string));
                } catch (NumberFormatException e) {
                    alert(string);
                }
            }
        }

    }

    public static void printMap(Map<String, String> map) {
        Iterator iterator = map.entrySet().iterator();


        while (iterator.hasNext()) {
            Map.Entry objValue1 = (Map.Entry) iterator.next();
            if (iterator.hasNext()) {
                System.out.print(objValue1.getKey() + " ");
            } else {
                System.out.print(objValue1.getKey());

            }
        }


        if (map.containsKey("obj")) {

            String objValue11 = (String) map.get("obj");
            System.out.println();
            try {
                alert(Double.parseDouble(objValue11));
            } catch (NumberFormatException var4) {
                alert(objValue11);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
