package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int max = 0;
        while (console.hasNextInt())
        {
            int x = console.nextInt();
            if (x > max && x % 2 == 0)
                max = x;
        }
        System.out.println(max);
    }
}
