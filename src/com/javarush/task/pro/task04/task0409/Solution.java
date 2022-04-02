package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

import static java.lang.Long.MAX_VALUE;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int min = 2147483647;
        int x;
        int y = 0;
        while (console.hasNextInt()) {
            y++;
            x = console.nextInt();
            if (x < min)
                min = x;
        }
        System.out.println(min);

    }
}