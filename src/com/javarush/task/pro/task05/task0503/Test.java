package com.javarush.task.pro.task05.task0503;

public class Test {

    public static void main(String[] args) {
        int[][] array = { {0, 1, 2, 3, 4 },
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7}};

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print('\n');
        }
    }
}
