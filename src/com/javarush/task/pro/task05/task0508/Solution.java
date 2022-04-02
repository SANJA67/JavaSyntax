package com.javarush.task.pro.task05.task0508;

import java.util.Arrays;
import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        String[] duplicate = new String[6];

        for (int j = 0; j < strings.length; j++) {
            int x = 0;
            for (int i = 1; i < strings.length; i++) {

                assert strings[j] != null;
                if (strings[j].equals(strings[i])) {
                    x++;
                    duplicate[i] = null;

                    if(x == 1) {
                        duplicate[j] = null;
                    }

                } else {

                }
            }
        }

        strings = Arrays.copyOf(duplicate, strings.length);

         */
        Scanner console = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < 6; i++) {
            strings[i] = console.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            String duplicate = strings[i];
            for (int j = i + 1; j < 6; j++) {
                if (duplicate == null) {
                    break;
                }
                if (duplicate.equals(strings[j])) {
                    strings[j] = null;
                    //if (strings[i] != null) {
                        strings[i] = null;
                    //}
                 }
            }
        }
        for (int i = 0; i < Solution.strings.length; i++) {
            System.out.print(Solution.strings[i] + ", ");
        }
    }
}