package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int maximum = Integer.parseInt(reader.readLine());
        int n;
        for (int i = 0; i<N-1; i++)
        {
            n = Integer.parseInt(reader.readLine());
            if (n>maximum)
                maximum = n;
        }


        //напишите здесь ваш код




        System.out.println(maximum);
    }
}