package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        while (a < 10) {
            int b = 0;
            while (b < 40) {
                if (a == 0 || a == 9) {
                    System.out.print("Б");
                    b++;
                } else {
                    if (b == 0 || b == 38)
                    System.out.print("Б");
                    else
                        System.out.print(" ");
                    b++;
                }
                b++;
            }
            a++;
            System.out.println();
        }
    }
}