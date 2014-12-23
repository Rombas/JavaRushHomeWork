package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        HashMap<String, String> list = new HashMap<String, String>();
        list.put("Башкиров","Роман");
        list.put("Мороз","Ольга");
        list.put("Новик","Борис");
        list.put("Стельмак","Вячеслав");
        list.put("Прохоцкий","Игорь");
        list.put("Волосатый","Святослав");
        list.put("Лев","Игорь");
        list.put("Стрелков","Игорь");
        list.put("Мальчикова","Лена");
        list.put("Мозг","Катя");
        return list;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //Напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int i = 0;
        while (iterator.hasNext())
        {
            Map.Entry<String, String > pair = iterator.next();
            if (pair.getValue().equals(name)) i++;
        }
        return i;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //Напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int i = 0;
        while (iterator.hasNext())
        {
            Map.Entry<String, String > pair = iterator.next();
            if (familiya.equals(pair.getKey())) i++;
        }
        return i;
    }

    public static void main(String[] args)
    {
        System.out.println(getCountTheSameFirstName(createMap(), "Игорь"));
        System.out.println(getCountTheSameLastName(createMap(), "Лев"));
    }
}
