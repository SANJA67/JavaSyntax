package com.javarush.task.pro.task02.task0205;

public class Test
{
    public static void main(String[] args)
    {
        long x = Math.round(2.7);
        int y = (int) Math.round(3.7);
        System.out.println(x);
        System.out.println(y);
/*
        double f1 = 0.0;
        for (int i = 1; i <= 11; i++) {
            f1 += .1;
        }

        //Умножаем 0.1 на 11
        double f2 = 0.1 * 11;

        //должно получиться одно и то же - 1.1 в обоих случаях
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        // Проверим!
        if (f1 == f2)
            System.out.println("f1 и f2 равны!");
        else
            System.out.println("f1 и f2 не равны!");

 */

        final double threshold = 0.0001;

        //прибавляем к нулю 0.1 одиннадцать раз подряд
        double f1 = .0;
        for (int i = 1; i <= 11; i++) {
            f1 += .1;
        }

        //Умножаем 0.1 на 11
        double f2 = .1 * 11;

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        if (Math.abs(f1 - f2) < threshold)
            System.out.println("f1 и f2 равны");
        else
            System.out.println("f1 и f2 не равны");


    }
}
