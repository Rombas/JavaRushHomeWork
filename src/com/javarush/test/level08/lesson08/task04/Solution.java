package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date ("january 1 1980"));
        map.put("Баронне", new Date ("february 21 1990"));
        map.put("Чип", new Date ("july 1 1993"));
        map.put("Чипо", new Date ("february 1 1993"));
        map.put("Чипол", new Date ("JULy 1 1993"));
        map.put("Чиполо", new Date ("february 1 1993"));
        map.put("Чиполон", new Date ("JULy 1 1993"));
        map.put("Чиполонн", new Date ("february 1 1993"));
        map.put("Чиполонне", new Date ("JULy 1 1993"));
        map.put("Чиполоннек", new Date ("february 1 1993"));

        //Напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //Напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            int month = iterator.next().getValue().getMonth() ;
            if (5 <= month && month <= 7)
            {
                iterator.remove();
            }
        }
    }

    public static void main (String[] args)
    {
        HashMap<String, Date> was = createMap();
        removeAllSummerPeople(was);
        System.out.println(was);
    }
}
