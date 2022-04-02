package com.javarush.task.jdk13.task06.task0625;

import java.util.Scanner;

/* 
Минимальная сумма
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

        int min = Integer.MAX_VALUE;
        int horizontal;
        int vertical;

        for (int i = 0; i < array.length; i++) {
            vertical = 0;
            horizontal = 0;
            for (int j = 0; j < array[i].length; j++) {
                horizontal += array[i][j];
                vertical += array[j][i];
                if (j == array[i].length - 1) {
                    if (horizontal < vertical) {
                        if (horizontal < min) {
                            min = horizontal;
                        }
                    } else {
                        if (vertical < min) {
                            min = vertical;
                        }

                    }
                }
            }
        }
        System.out.println(min);
    }
}



