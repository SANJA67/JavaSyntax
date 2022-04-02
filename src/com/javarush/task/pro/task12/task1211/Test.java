package com.javarush.task.pro.task12.task1211;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static int[] arr = {3,1,9,8,11,6};
    public static void main(String[] args) {
        // исходный массив


// определяем количество прогонов
// перебирать будем всё до предпоследнего элемента, каждый раз сдвигая его ближе к началу
        for (int j = arr.length - 1; j > 0; j--) {
            // основной цикл внутри каждого прогона
            // перебираем все элементы от первого до последнего в прогоне, который мы определили выше
            for (int i = 0; i < j; i++) {
                // если текущий элемент больше следующего
                if (arr[i] > arr[i + 1]) {
                    // запоминаем значение текущего элемента
                    int temp = arr[i];
                    // записываем на его место значение следующего
                    arr[i] = arr[i + 1];
                    // а на место следующего ставим значение текущего, тем самым меняем их местами
                    arr[i + 1] = temp;
                }
                // выводим текущее состояние массива в консоль
                // это необязательный шаг, он здесь для наглядности
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}
