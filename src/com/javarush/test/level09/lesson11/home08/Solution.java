package com.javarush.test.level09.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов
длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //Написать тут ваш код
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<int[]> numbers = new ArrayList<int[]>();
        int[] num1 = new int[5];
        int[] num2 = new int[2];
        int[] num3 = new int[4];
        int[] num4 = new int[7];
        int[] num5 = new int[0];

        for (int i = 0; i < num1.length; i++)
            num1[i] = i;
        for (int i = 0; i < num2.length; i++)
            num2[i] = i;
        for (int i = 0; i < num3.length; i++)
            num3[i] = i;
        for (int i = 0; i < num4.length; i++)
            num4[i] = i;
        for (int i = 0; i < num5.length; i++)
            num5[i] = i;

        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);
        numbers.add(num4);
        numbers.add(num5);

        return numbers;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
