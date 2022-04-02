package com.javarush.task.pro.task03.task0309;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        String[] strings1 = new String[6];
        for (int i = 0; i < strings.length - 1; i++) {
            String str = strings[i];
            for (int j = 1; j < strings.length; j++) {
               // System.out.println("я тут 1");
                if (str.equals(strings[j])) {
                 //   System.out.println("я тут 2");
                    strings1[i] = null;
                    strings1[j] = null;
                    if (str.equals(strings[j + 1])) {
                        //   System.out.println("я тут 2");
                       // strings1[i] = null;
                        strings1[j + 1] = null;

                    }
                } else {

                }
                //System.out.println("я тут 3");
            }
        }
        strings = strings1;
        for (int i = 0; i < strings.length; i++) {
            if (i != 5)
                System.out.print(strings[i] + ", ");
            else
                System.out.print(strings[i]);
        }


    }
}
