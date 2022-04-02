package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int max = -2147483648;
        int maxA = 0;
        int x;
        while (console.hasNextInt()) {
            x = console.nextInt();
            if (x > max && x % 2 == 0)
                max = x;
            else if (x > maxA)
                maxA = x;

        }
        if (max != 0)
            System.out.println(max);
        else
            System.out.println(maxA);

    }
}