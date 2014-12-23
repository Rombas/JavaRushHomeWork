package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        // Создай по два объекта каждого класса тут
        Man Petro = new Man("Petro",24,"Piter");
        Man Roman = new Man("Roman",24,"Bobruisk");
        Woman Olga = new Woman("Olga",24,"Bobrusk");
        Woman Alina = new Woman ("Alina",48,"Vitebsk");
        // Выведи их на экран тут
        System.out.println(Petro.name + " "+ Petro.age + " "+ Petro.address);
        System.out.println(Roman.name + " "+ Roman.age + " "+ Roman.address);
        System.out.println(Olga.name + " "+ Olga.age + " "+ Olga.address);
        System.out.println(Alina.name + " "+ Alina.age + " "+ Alina.address);
    }

    public static class Man
    {
        public String name, address;
        public int age;
        public Man(String name, int age,String  address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman
    {
        public String name, address;
        public int age;
        public Woman(String name, int age,String  address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    // Напиши тут свои классы
}
