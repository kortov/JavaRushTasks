package com.javarush.task.task15.task1530;

/**
 * Created by eugenekortov on 09/02/17.
 */
public abstract class DrinkMaker {
    final void makeDrink() {

        getRightCup();
        putIngredient();
        pour();
    }

    abstract void getRightCup();

    abstract void putIngredient();

    abstract void pour();
}
