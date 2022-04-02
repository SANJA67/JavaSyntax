package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int min = 0;
        int min2 = 0;
        int i = 0;
        int x;
        int first;
        while (console.hasNextInt()) {
            ++i;
            x = console.nextInt();
            if (i == 1) {
                first = console.nextInt();
                min2 = Math.max(first, x);
                min = Math.min(first, x);
            } else {
                 if (min2 == min) {
                    if (x < min) {
                        min = x;
                    } else {
                        min2 = x;
                    }
                } else if (x < min) {
                    min2 = min;
                    min = x;
                } else if (x < min2 && x > min) {
                    min2 = x;
                }

            }
        }
        System.out.println(min2);
    }
}

