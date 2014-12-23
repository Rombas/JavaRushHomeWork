package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
+1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        Human grandpa = new Human("Коля", true, 70, null, null);
        Human grandPa = new Human("Андрей", true, 69, null, null);
        Human grandba = new Human("Тома", false, 70, null, null);
        Human grandBa = new Human("Тася", false, 65, null, null);
        Human father = new Human("Анатолий", true, 45, grandPa, grandBa);
        Human mother = new Human("Алина", false,44, grandpa, grandba);
        Human child1 = new Human("Роман", true, 24, father,mother);
        Human child2 = new Human("Ольга", false, 24, father,mother);
        Human child3 = new Human("Миша", true, 6, father,mother);
        System.out.println(grandpa);
        System.out.println(grandba);
        System.out.println(grandPa);
        System.out.println(grandBa);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        //Написать тут ваш код
        String name;
        Boolean sex;
        int age;
        List<Human> children = new ArrayList<Human>();

        public Human(String name, Boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            if (father!=null)
            {
                father.children.add(this);
                mother.children.add(this);
            }
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
