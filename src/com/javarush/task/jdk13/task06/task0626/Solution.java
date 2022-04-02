package com.javarush.task.jdk13.task06.task0626;

import java.util.Scanner;

/* 
Первая база данных
*/

public class Solution {
    public static String[][] array = new String[][]{{"123", "Иванов", "Богдан"},
            {"1425", "Петрова", "Марина"},
            {"37", "Богдан", "Андрей"},
            {"98", "Богданова", "Марина"},
            {"6285", "Прутко", "Сергей"},
            {"8", "Клочкова", "Елена"},
            {"754", "Котов", "Иван"}};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sample = scanner.nextLine();

        for (int i = 0; i < array.length; i++) {
            if (array[i][0].equals(sample) || array[i][1].equals(sample) || array[i][2].equals(sample)) {
                System.out.println(array[i][0] + " " + array[i][1] + " " + array[i][2]);

            }
        }
    }
}

