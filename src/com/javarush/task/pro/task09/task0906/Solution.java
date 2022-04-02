package com.javarush.task.pro.task09.task0906;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber <= 0) {
            return "";
        }
        String resalt = "";
        while (decimalNumber != 0) {
            resalt = decimalNumber % 2 + resalt;
            decimalNumber = decimalNumber / 2;
        }

        return resalt;
    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.equals("")) {
            return 0;
        }
        int resalt = 0;
        for (int i = 0; i<binaryNumber.length();i++){
            resalt += Character.getNumericValue(binaryNumber.charAt(i))
                    * Math.pow(2, binaryNumber.length() - 1 - i);
        }
        return resalt;
    }
}
