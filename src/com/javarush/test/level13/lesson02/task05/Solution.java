package com.javarush.test.level13.lesson02.task05;

/* 4 ошибки
Исправь 4 ошибки в программе, чтобы она компилировалась.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {

        System.out.println(new Dream().HOBBIE.toString());
        System.out.println(new Hobbie().toString());

    }

        interface Desire
        {
            String toString();
        }

        class Dream
        {
            Hobbie HOBBIE = new Hobbie();
        }

        class Hobbie extends Dream implements Desire
        {
            int INDEX = 1;

            @Override
            public String toString()
            {
                INDEX++;
                return "" + INDEX;
            }
        }

}
