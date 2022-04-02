package com.javarush.task.jdk13.task06.task0632;

import java.util.Scanner;

/* 
Пирамида
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        array = new char[height][2 * height - 1];
        int a = 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j < array.length - i - 1 || j > array[0].length - array.length + i) {
                    array[i][j] = ' ';
                } else {
                    array[i][j] = '#';
                }
            }
            a += 2;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);

            }
            System.out.println();
        }
    }
}
