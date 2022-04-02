package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length1 = scanner.nextInt();
        int length2 = scanner.nextInt();
        int length3 = scanner.nextInt();
        if (length1 + length2 > length3) {
            if (length1 + length3 > length2)
                if (length2 + length3 > length1) System.out.println( "треугольник существует");
                else System.out.println("треугольник не существует");
            else System.out.println("треугольник не существует");
        } else {
            System.out.println("треугольник не существует");
        }
    }
}
