package com.javarush.task.jdk13.task06.task0623;
/*
Знакомство с двумерным массивом
В классе Solution проинициализируй поле array значением двумерного массива целых
чисел размерностью 2х3.
В методе main заполни этот массив целыми числами (кроме 0) и выведи на экран.


Requirements:
1. Поле array класса Solution нужно проинициализировать значением двумерного массива
целых чисел размерностью 2х3.
2. Этот массив необходимо заполнить любыми целыми числами, кроме 0.
3. В программе нужно вывести элементы массива, каждый элемент с новой строки.
*/

/* 
Знакомство с двумерным массивом
*/

public class Solution {
    public static int[][] array = new int[2][3];

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int k = j;
                array[i][j] = ++k;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                 System.out.println(array[i][j]);
            }
        }
    }
}
