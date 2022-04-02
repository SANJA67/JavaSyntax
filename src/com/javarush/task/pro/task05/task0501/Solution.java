package com.javarush.task.pro.task05.task0501;

/* 
Создаем массивы
*/

public class Solution {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        double[] doubleArray = new double[10];

        for (int i = 0; i < 10; i++) {
            intArray[i] = i;
            doubleArray[i] = (double) i + 0.1;

        }
    }
}
