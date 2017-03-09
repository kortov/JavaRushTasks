package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

import java.io.IOException;
import java.io.InterruptedIOException;

public class Solution {
    public static void main(String[] args) {
    }
    
    static class MyException extends ArrayIndexOutOfBoundsException {
    }

    static class MyException2 extends ArithmeticException{
    }

    static class MyException3 extends IOException{
    }

    static class MyException4 extends InterruptedIOException{
    }
}

