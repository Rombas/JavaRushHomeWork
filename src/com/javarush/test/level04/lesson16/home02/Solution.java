package com.javarush.test.level04.lesson16.home02;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a =Integer.parseInt(reader.readLine());
        int b =Integer.parseInt(reader.readLine());
        int c =Integer.parseInt(reader.readLine());
        int max = max(max(a,b),c);
        int min = min(min(a,b),c);
        if ((a>min)&&(a<max)) System.out.println(a);
        else if ((b>min)&&(b<max)) System.out.println(b);
        else if ((c>min)&&(c<max)) System.out.println(c);
    }
    public static int max(int a, int b)
    {
        if (a > b) return a;
        else return b;
    }
    public static int min(int a, int b)
    {
        if (a < b) return a;
        else return b;
    }
}
