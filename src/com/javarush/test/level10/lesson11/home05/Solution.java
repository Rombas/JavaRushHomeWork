package com.javarush.test.level10.lesson11.home05;

import javax.xml.bind.SchemaOutputResolver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).
Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        ArrayList<Integer> count = new ArrayList<Integer>();
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(int i=0;i<32;i++)
        {
            alphabet.add( (char) ('а'+i));
            count.add(0);
        }
        alphabet.add(6,'ё');
        count.add(0);

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<10;i++)
        {
            String s = reader.readLine();
            list.add( s.toLowerCase());
        }



        for(String i : list)
        {
            char[] word = i.toCharArray();
            for (char j: word)
            {
                int b = count.get(alphabet.indexOf(j));
                b++;
                count.set(alphabet.indexOf(j), b);
            }
        }

        for (int i = 0; i < alphabet.size(); i++)
        {
            System.out.println(alphabet.get(i)+" "+count.get(i));
        }
        //Напишите тут ваш код
    }

}
