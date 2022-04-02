package com.javarush.task.pro.task09.task0907;

import java.util.Objects;
import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        if (decimalNumber <= 0) {
            return "";
        }
        String resalt = "";

        while(decimalNumber > 0) {
            resalt = HEX.charAt(decimalNumber % 16) + resalt;
            decimalNumber = decimalNumber / 16;
        }
        return resalt;
    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber == null || hexNumber.equals("")) {
            return 0;
        }
        int resalt = 0;
        char[] ch = hexNumber.toCharArray();
        for (int i =  0; i < hexNumber.length(); i++) {
            resalt = HEX.indexOf(ch[i]) * (int) Math.pow(16, hexNumber.length() - (i + 1)) + resalt;
        }
        return resalt;
    }
}
