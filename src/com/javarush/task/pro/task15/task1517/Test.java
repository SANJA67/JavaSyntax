package com.javarush.task.pro.task15.task1517;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        //System.out.println(Files.size(Path.of("C:\\Users\\Пользователь\\Desktop\\Чем так плох Java IO.docx")));
        //Files.createFile(Path.of("C:/Users/Пользователь/Desktop/TEST/это я новый файл.txt"));
        //Files.createDirectory(Path.of("C:/Users/Пользователь/Desktop/TEST/это я новая папка"));
        //Files.createDirectories(Path.of("C:/Users/Пользователь/Desktop/TEST/это я новая папка/это я новая папка2/это я новая папка3"));
        List<String> bv = Files.readAllLines((Path.of("C:\\Users\\Пользователь\\Desktop\\Чем так плох Java IO.docx")));
       /* for (byte b : bv) {
            System.out.println((char) b);
        }*/
    }

}
