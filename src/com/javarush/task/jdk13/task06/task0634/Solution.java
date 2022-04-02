package com.javarush.task.jdk13.task06.task0634;

import java.util.Scanner;

/* 
Шахматная доска
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int theSize = scanner.nextInt();
        array = new char[theSize][theSize];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        array[i][j] = '#';
                    } else {
                        array[i][j] = ' ';
                    }

                } else {
                    if (j % 2 == 0) {
                        array[i][j] = ' ';
                    } else {
                        array[i][j] = '#';
                    }
                }

                /*
                if () {
                    array[i][j] = '1';
                } else if (i % 2 != 0 && j % 2 == 0) {
                    array[i][j] = '2';
                } else if (i % 2 != 0 && j % 2 != 0){
                    array[i][j] = '3';
                } else if (i % 2 != 0 && j % 2 == 0){
                    array[i][j] = '4';
                }

                 */
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }
}
