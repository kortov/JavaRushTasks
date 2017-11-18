package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String person = fileScanner.nextLine();
            String[] strings = person.split(" ");
            String lastName = strings[0];
            String firstName = strings[1];
            String middleName = strings[2];
            SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
            Date date = null;
            try {
                date = formatter.parse(strings[3] + " " + strings[4] + " " + strings[5]);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            return new Person(firstName, middleName, lastName, date);
        }

        @Override
        public void close() throws IOException {

            fileScanner.close();
        }
    }
}
