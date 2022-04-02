package com.javarush.task.jdk13.task06.task0637;

import java.util.Arrays;

/* 
Прямоугольник
*/

public class Solution {
    public static char[][] array = new char[5][6];

    public static void main(String[] args) {

        Arrays.fill(array[0],  'X');
        Arrays.fill(array[1],  'X');
        Arrays.fill(array[2],  'X');
        Arrays.fill(array[3],  'X');
        Arrays.fill(array[4],  'X');
        Arrays.fill(array[1], 1, 5,  ' ');
        Arrays.fill(array[2], 1, 5,  ' ');
        Arrays.fill(array[3], 1, 5,  ' ');
        System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.toString(array[1]));
        System.out.println(Arrays.toString(array[2]));
        System.out.println(Arrays.toString(array[3]));
        System.out.println(Arrays.toString(array[4]));
    }
}
