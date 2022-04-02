package com.javarush.task.pro.task09.task0913;

public class Test {

    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int firstIndex = path.indexOf("jdk");
        int lastIndex = path.indexOf("/", firstIndex);
        System.out.println(firstIndex + " " + lastIndex);
        String oldJdk = path.substring(firstIndex, lastIndex);
        System.out.println(oldJdk);
        return path.replace(oldJdk, jdk);
    }
}
