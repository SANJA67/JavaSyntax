package com.javarush.task.pro.task05.task0510;

/* 
Треугольный массив
*/

import java.util.Arrays;

public class Solution {

    public static int[][] result = new int[10][];
    public static int count;

    public static void main(String[] args) {
        int numberOfArrayElements = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[++numberOfArrayElements];
        }


        for (int i = 0; i < result.length; i++) {
            count = i;
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = count++;
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
