package com.javarush.task.pro.task14.task1418;

public class ChildrenNotInitializedException extends RuntimeException {
    ChildrenNotInitializedException (String str) {
        System.out.println(str);
    }
}
