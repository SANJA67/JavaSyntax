package com.javarush.task.pro.task09.task0908;

/*
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.equals("")) {
            return "";
        }
        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = "0" + binaryNumber;
        }
        for (int i = 0; i < binaryNumber.length(); i++) {

            if (binaryNumber.charAt(i) == '0' || binaryNumber.charAt(i) == '1') {

            } else {
                return "";
            }
        }
        String resalt = "";
        char ch = '\u0000';
        char[] chars = binaryNumber.toCharArray();

        for (int i = 0; i < binaryNumber.length(); i += 4) {

            if (chars[i] == '0' && chars[i + 1] == '0' && chars[i + 2] == '0' && chars[i + 3] == '0') {
                ch = '0';

            } else if (chars[i] == '0' && chars[i + 1] == '0' && chars[i + 2] == '0' && chars[i + 3] == '1') {
                ch = '1';

            } else if (chars[i] == '0' && chars[i + 1] == '0' && chars[i + 2] == '1' && chars[i + 3] == '0') {
                ch = '2';

            } else if (chars[i] == '0' && chars[i + 1] == '0' && chars[i + 2] == '1' && chars[i + 3] == '1') {
                ch = '3';

            } else if (chars[i] == '0' && chars[i + 1] == '1' && chars[i + 2] == '0' && chars[i + 3] == '0') {
                ch = '4';

            } else if (chars[i] == '0' && chars[i + 1] == '1' && chars[i + 2] == '0' && chars[i + 3] == '1') {
                ch = '5';

            } else if (chars[i] == '0' && chars[i + 1] == '1' && chars[i + 2] == '1' && chars[i + 3] == '0') {
                ch = '6';

            } else if (chars[i] == '0' && chars[i + 1] == '1' && chars[i + 2] == '1' && chars[i + 3] == '1') {
                ch = '7';

            } else if (chars[i] == '1' && chars[i + 1] == '0' && chars[i + 2] == '0' && chars[i + 3] == '0') {
                ch = '8';

            } else if (chars[i] == '1' && chars[i + 1] == '0' && chars[i + 2] == '0' && chars[i + 3] == '1') {
                ch = '9';

            } else if (chars[i] == '1' && chars[i + 1] == '0' && chars[i + 2] == '1' && chars[i + 3] == '0') {
                ch = 'a';

            } else if (chars[i] == '1' && chars[i + 1] == '0' && chars[i + 2] == '1' && chars[i + 3] == '1') {
                ch = 'b';

            } else if (chars[i] == '1' && chars[i + 1] == '1' && chars[i + 2] == '0' && chars[i + 3] == '0') {
                ch = 'c';

            } else if (chars[i] == '1' && chars[i + 1] == '1' && chars[i + 2] == '0' && chars[i + 3] == '1') {
                ch = 'd';

            } else if (chars[i] == '1' && chars[i + 1] == '1' && chars[i + 2] == '1' && chars[i + 3] == '0') {
                ch = 'e';

            } else if (chars[i] == '1' && chars[i + 1] == '1' && chars[i + 2] == '1' && chars[i + 3] == '1') {
                ch = 'f';

            }
            resalt = resalt + ch + "";
        }
        return resalt;
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber == null || hexNumber.equals("")) {
            return "";
        }
        String resalt = "";

        for (int i = 0; i < hexNumber.length(); i++) {
            char ch = hexNumber.charAt(i);
            if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9' || ch == 'a' || ch == 'b' || ch == 'c' || ch == 'd' || ch == 'e' || ch == 'f') {

                char[] bin = new char[4];
                if (ch == '0') {
                    bin[0] = '0';
                    bin[1] = '0';
                    bin[2] = '0';
                    bin[3] = '0';

                } else if (ch == '1') {

                    bin[0] = '0';
                    bin[1] = '0';
                    bin[2] = '0';
                    bin[3] = '1';

                } else if (ch == '2') {
                    bin[0] = '0';
                    bin[1] = '0';
                    bin[2] = '1';
                    bin[3] = '0';

                } else if (ch == '3') {
                    bin[0] = '0';
                    bin[1] = '0';
                    bin[2] = '1';
                    bin[3] = '1';

                } else if (ch == '4') {
                    bin[0] = '0';
                    bin[1] = '1';
                    bin[2] = '0';
                    bin[3] = '0';

                } else if (ch == '5') {
                    bin[0] = '0';
                    bin[1] = '1';
                    bin[2] = '0';
                    bin[3] = '1';

                } else if (ch == '6') {
                    bin[0] = '0';
                    bin[1] = '1';
                    bin[2] = '1';
                    bin[3] = '0';

                } else if (ch == '7') {
                    bin[0] = '0';
                    bin[1] = '1';
                    bin[2] = '1';
                    bin[3] = '1';

                } else if (ch == '8') {
                    bin[0] = '1';
                    bin[1] = '0';
                    bin[2] = '0';
                    bin[3] = '0';

                } else if (ch == '9') {
                    bin[0] = '1';
                    bin[1] = '0';
                    bin[2] = '0';
                    bin[3] = '1';

                } else if (ch == 'a') {
                    bin[0] = '1';
                    bin[1] = '0';
                    bin[2] = '1';
                    bin[3] = '0';

                } else if (ch == 'b') {
                    bin[0] = '1';
                    bin[1] = '0';
                    bin[2] = '1';
                    bin[3] = '1';

                } else if (ch == 'c') {
                    bin[0] = '1';
                    bin[1] = '1';
                    bin[2] = '0';
                    bin[3] = '0';

                } else if (ch == 'd') {
                    bin[0] = '1';
                    bin[1] = '1';
                    bin[2] = '0';
                    bin[3] = '1';

                } else if (ch == 'e') {
                    bin[0] = '1';
                    bin[1] = '1';
                    bin[2] = '1';
                    bin[3] = '0';

                } else {
                    bin[0] = '1';
                    bin[1] = '1';
                    bin[2] = '1';
                    bin[3] = '1';

                }
                resalt = "" + resalt + bin[0] + bin[1] + bin[2] + bin[3];

            } else {
                return "";
            }
        }
        return resalt;
    }
}
