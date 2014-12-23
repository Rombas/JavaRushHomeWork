package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число,
 иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("JANUARY 1 2000"));
    }

    public static boolean isDateOdd(String date)
    {
        Date newYear = new Date(1900, 0, 1);
        Date nowDate = new Date(date);
        newYear.setYear(nowDate.getYear());

        //получаем валовое количество миллисекунд
        long timeDistance = nowDate.getTime()-newYear.getTime();

        //делим валовое количество миллисекунд на миллисекунды в дне
        int dayCount = (int)(timeDistance/(24*60*60*1000)); //получаем кол-во дней

        if (dayCount%2 == 0) return true;
        else return false;
    }
}
