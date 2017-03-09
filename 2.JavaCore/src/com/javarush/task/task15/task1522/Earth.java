package com.javarush.task.task15.task1522;

/**
 * Created by eugenekortov on 03/02/17.
 */
public class Earth implements Planet{
    private static Earth instance;

    private Earth(){}

    public static Earth getInstance(){
        if(instance == null){
            instance = new Earth();
        }
        return instance;
    }
}
