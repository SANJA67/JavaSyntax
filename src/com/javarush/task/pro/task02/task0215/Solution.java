package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        int number1 = numbers.nextInt();
        int number2 = numbers.nextInt();
        int number3 = numbers.nextInt();
        System.out.println((number1 + number2 + number3) /3);
    }
}
