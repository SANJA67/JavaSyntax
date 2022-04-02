package com.javarush.task.pro.task05.task0517;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] x = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int[] x2 = Arrays.copyOfRange(x, 0, x.length / 2);
        System.out.println( Arrays.toString(x2));

        int[] x3 = Arrays.copyOfRange(x, x.length / 2, x.length);
        System.out.println( Arrays.toString(x3));
    }
}
