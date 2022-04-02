package com.javarush.task.pro.task11.task1103;

/* 
Презентация роботов
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println("Презентация роботов произведенных компанией " + Robot.vendor);

        Robot robot1 = new Robot("RCV-322", 2019);
        robot1.displayInformation();

        Robot robot2 = new Robot("JavaTron-008", 2017);
        robot2.displayInformation();

        Robot robot3 = new Robot("BugDestroyer-007", 1998);
        robot3.displayInformation();

        Robot robot4 = new Robot("Gundam-14", 2004);
        robot4.displayInformation();

        Robot robot5 = new Robot("Eve-2", 2012);
        robot5.displayInformation();
    }
}
/*

Презентация роботов произведенных компанией Javarush Co.
Я 1-й из 1 роботов. Модель: RCV-322. Произведен компанией Javarush Co. в 2019 году.
Я 2-й из 2 роботов. Модель: JavaTron-008. Произведен компанией Javarush Co. в 2017 году.
Я 3-й из 3 роботов. Модель: BugDestroyer-007. Произведен компанией Javarush Co. в 1998 году.
Я 4-й из 4 роботов. Модель: Gundam-14. Произведен компанией Javarush Co. в 2004 году.
Я 5-й из 5 роботов. Модель: Eve-2. Произведен компанией Javarush Co. в 2012 году.

 */