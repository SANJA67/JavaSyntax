package com.javarush.task.pro.task13.task1318;

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        int ordinal = month.ordinal() + 1;
        return Month.values()[ordinal];
    }
}
