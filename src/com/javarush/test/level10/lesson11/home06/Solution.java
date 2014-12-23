package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String name;
        String surname;
        int age;
        boolean sex;
        String country;
        int number;

        public Human(String name, String surname, int age, boolean sex, String country, int number)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.country = country;
            this.number = number;
        }

        public Human(String name, String surname, int age, boolean sex, String country)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.country = country;
        }

        public Human(String name, String surname, int age, boolean sex)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String surname, int age)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public Human(String name, String surname)
        {
            this.name = name;
            this.surname = surname;
        }

        public Human(String name)
        {
            this.name = name;
        }

        public Human(boolean sex, String country)
        {
            this.sex = sex;
            this.country = country;
        }

        public Human(int age, String country, String name, int number, boolean sex)
        {
            this.age = age;
            this.country = country;
            this.name = name;
            this.number = number;
            this.sex = sex;
        }

        public Human(String name, String surname, int number, boolean sex, int age)
        {
            this.name = name;
            this.surname = surname;
            this.number = number;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, String surname, String country, int number)
        {
            this.name = name;
            this.sex = sex;
            this.surname = surname;
            this.country = country;
            this.number = number;
        }
    }
}
