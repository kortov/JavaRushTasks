package com.javarush.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD2
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    private static SimpleDateFormat format = new SimpleDateFormat("dd/M/yyyy");

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));
        allPeople.add(Person.createMale("Петров Петр", new Date()));
    }

    public static void main(String[] args) throws Exception {
        doIt(args);
    }



    public static void doIt(String[] args) throws Exception {
        String[][] newArgs = null;
        switch (args[0]) {
            case "-c": {
                newArgs = parseArgs(args, 3);
                for (int i = 0; i < newArgs.length; i++) {
                    createPerson(newArgs[i]);
                }
                return;
            }
            case "-u": {
                updatePerson(args);
                return;
            }
            case "-d": {
                deletePerson(args);
                return;
            }
            case "-i": {
                infoAboutPerson(args);
                return;
            }
        }
        return ;
    }

    private static String[][] parseArgs(String[] args, int step) {
        String[] shiftedArgs = new String[args.length - 1];
        System.arraycopy(args, 1, shiftedArgs, 0, shiftedArgs.length);

        String[][] newArgs = new String[shiftedArgs.length / step][step];
        for (int i = 0, j = 0; i < shiftedArgs.length; i += step, j++) {
                System.arraycopy(shiftedArgs,i,newArgs[j],0,step);
        }
        return newArgs;
    }

    public static void createPerson(String[] args) throws Exception {
        Person person;
        if ("ж".equals(args[1])) {
            person = Person.createFemale(args[0], format.parse(args[2]));
        } else {
            person = Person.createMale(args[0], format.parse(args[2]));
        }
        allPeople.add(person);
        System.out.println(allPeople.size() - 1);
    }

    public static void updatePerson(String[] args) throws Exception {
        Person temp = allPeople.get(Integer.valueOf(args[1]));
        if ("ж".equals(args[2])) {
            temp.setName(args[1]);
            temp.setSex(Sex.FEMALE);
            temp.setBirthDay(format.parse(args[3]));
        } else {
            temp.setName(args[1]);
            temp.setSex(Sex.MALE);
            temp.setBirthDay(format.parse(args[3]));
        }
    }

    public static void deletePerson(String[] args) {
        Person person = allPeople.get(Integer.valueOf(args[1]));
        person.setBirthDay(null);
        person.setSex(null);
        person.setName(null);
    }

    public static void infoAboutPerson(String[] args) throws Exception {
        Person person = allPeople.get(Integer.valueOf(args[1]));
        String result = person.getName();
        if (Sex.MALE.equals(person.getSex())) result += " м ";
        if (Sex.FEMALE.equals(person.getSex())) result += " ж ";
        SimpleDateFormat form = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        result += form.format(person.getBirthDay());
        System.out.println(result);
    }
}
