package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int[] obr = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i<obr.length; i++)
        {
            obr[i] = Integer.parseInt(reader.readLine());
        }
        obr = Obratka(obr);

        for (int i = 0; i < obr.length; i++)
        {
            System.out.println(obr[i]);
        }
    }

    public static int[] Obratka(int[] obr)
    {
        int[] n = new int[obr.length];
        for (int i = 0; i< obr.length; i++)
        {
            n[i] = obr[obr.length-i-1];
        }
        return n;
    }
}
