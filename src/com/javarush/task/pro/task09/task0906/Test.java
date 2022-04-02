package com.javarush.task.pro.task09.task0906;

public class Test {

    public static void main(String[] args)
    {
        char ch1 = '1';
        char ch2 = '1';
        char ch3 = '1';
        char ch4 = '7';
        char ch5 = '1';
        int r1 = Character.getNumericValue(ch1); //return int value for the specified character
        int r2 = Character.getNumericValue(ch2);
        int r3 = Character.getNumericValue(ch3);
        int r4 = Character.getNumericValue(ch4);
        int r5 = Character.getNumericValue(ch5);
        System.out.println("The character " + ch1 + " has int value : " + r1);
        System.out.println("The character " + ch2 + " has int value : " + r2);
        System.out.println("The character " + ch3 + " has int value : " + r3);
        System.out.println("The character " + ch4 + " has int value : " + r4);
        System.out.println("The character " + ch5 + " has int value : " + r5);
    }
}
