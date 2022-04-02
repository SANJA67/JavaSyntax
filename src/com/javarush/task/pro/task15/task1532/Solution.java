package com.javarush.task.pro.task15.task1532;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* 
Шифр
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        System.out.println(encrypt("abcdefghi"));
    }

    public static ByteArrayOutputStream encrypt(String message) throws IOException {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] noWord = message.getBytes();
        for (int i = 0; i < noWord.length / 2; i++) {
            baos.write(noWord[i]);
            baos.write(noWord[noWord.length - i - 1]);
        }
        if (noWord.length % 2 == 1) {
            baos.write(noWord[noWord.length / 2]);
        }

        return baos;
    }
}
