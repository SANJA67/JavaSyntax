package com.javarush.task.jdk13.task06.task0627;

import java.util.Scanner;

/* 
Вот это переворот!
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int[][] arrayDuplicate = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                arrayDuplicate[j][i] = array[i][j];

            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = arrayDuplicate[i][j];
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
    }
}
