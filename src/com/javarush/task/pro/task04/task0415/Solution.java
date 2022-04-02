package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
        /*
        double pi = 3.14;
        Scanner scanner = new Scanner(System.in);
        int radius =  scanner.nextInt();
        if (radius < 0) {
            System.exit(radius);
        }
        int areaCircle = (int) (pi * radius * radius);
        System.out.println(areaCircle);

         */


        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();

        if (radius > 0) {
            double pi = 3.14;
            int square = (int) (pi * radius * radius);

            System.out.println(square);
        }
    }
}