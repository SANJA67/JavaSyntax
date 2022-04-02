package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner consolInt = new Scanner(System.in);
        Scanner consolString = new Scanner(System.in);
        String str = consolString.nextLine();
        int number = consolInt.nextInt();

        int i = 0;

        do {
            i++;
            System.out.println(str);
            if (number <= 0 || number >= 5) break;
        }while (i < number);


    }
}