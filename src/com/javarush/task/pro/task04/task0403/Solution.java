package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int i = 0;
        int a = 0;
        while (!(str.equals("ENTER"))) {
            i = Integer.parseInt(str);
            a += i;
            str = scanner.nextLine();
        }
        System.out.println(a);
    }
}