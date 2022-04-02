package com.javarush.task.pro.task15.task1524;

import java.io.*;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             FileInputStream fis = new FileInputStream(scanner.nextLine());
             FileOutputStream fos = new FileOutputStream(scanner.nextLine())) {
            byte[] bytesIn = fis.readAllBytes();
            byte[] bytesOut = new byte[bytesIn.length];
            for (int i = 0; i < bytesIn.length; i += 2) {
                if (i < bytesIn.length - 1) {
                    bytesOut[i] = bytesIn[i + 1];
                    bytesOut[i + 1] = bytesIn[i];
                } else {
                    bytesOut[i] = bytesIn[i];
                }
            }
            fos.write(bytesOut);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
        /*
        try {
            // new File("C:\\Users\\Пользователь\\Desktop\\Test/файл1.txt").createNewFile();
            // new File("C:\\Users\\Пользователь\\Desktop\\Test/файл2.txt").createNewFile();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Шаг 1");
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();
            System.out.println("Шаг 2");
            FileInputStream fileInputStream = new FileInputStream(fileName1);
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileName2);

            System.out.println("Шаг 3");
            while (true) {
                int b = fileInputStream.read();
                System.out.println(b);
                int c = fileInputStream.read();
                System.out.println(c);
                System.out.println("Шаг 4");
                if (c == -1) {
                    System.out.println("Шаг 6");
                    if (b != -1) {
                        FileOutputStream fileOutputStream1 = new FileOutputStream(fileName1);
                        fileOutputStream1.write(b);
                        fileOutputStream1.close();
                    }
                    break;
                } else {
                    System.out.println("Шаг 5");
                    fileOutputStream2.write(b);
                    fileOutputStream2.write(c);
                    System.out.println(b + " и " + c);

                }
            }
            reader.close();
            fileInputStream.close();
            fileOutputStream2.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

         */
    }
}


/*
Почему идея заставляет меня переопределить метод read()?
 */