package com.javarush.task.pro.task15.task1515;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Абсолютный путь
*/

public class Solution {
    public static void main(String[] args) {
        // C:\Users\Пользователь\Desktop\Test\файл1.txt
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        Path file = Path.of(str);
        if ((!file.isAbsolute())) {
            Path pathAbsolute = file.toAbsolutePath();
            System.out.println(pathAbsolute);
        }

    }
}

