package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        int[] numbers = new int[0];
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            numbers = new int[number];
            for (int i = 0; i < number; i++) {
                numbers[i] = scanner.nextInt();
            }
        }

        if (number % 2 != 0) {
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        } else {
            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.println(numbers[i]);
            }
        }


    }
}
