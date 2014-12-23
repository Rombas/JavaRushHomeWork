package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так,
чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        Human grandpa = new Human("Андрей",true,70, null, null);
        Human grandPa = new Human("Николай",true,77, null, null);
        Human grandba = new Human("Тася",false,60, null, null);
        Human grandBa = new Human("Тамара",false,65, null, null);
        Human father = new Human("Анатолий",true,50, grandPa, grandBa);
        Human mother = new Human("Алина",false,45, grandpa, grandba);
        Human child1 = new Human("Роман",true,24, father, mother);
        Human child2 = new Human("Ольга",false,23, father, mother);
        Human child3 = new Human("Денис",true,21, father, mother);
        System.out.println(grandpa.toString());
        System.out.println(grandPa.toString());
        System.out.println(grandba.toString());
        System.out.println(grandBa.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human
    {
        private Human father;
        private Human mother;
        //Написать тут ваш код
        String name = new String();
        private Boolean sex;
        private int age;
        //Human father = new Human();


        public Human(String name, Boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
