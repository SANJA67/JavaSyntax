package com.javarush.task.pro.task15.task1527;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
 Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) {
        // C:\Users\Пользователь\Desktop\Test\файл1.txt
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        try(FileReader in = new FileReader(str);
            BufferedReader reader = new BufferedReader(in))
        {
            while (reader.ready())
            {

                String line = reader.readLine();
                list.add(line);

            }
            for (int i = 0; i < list.size(); i++) {
                if (i % 2 == 0) {
                    System.out.println(list.get(i));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}