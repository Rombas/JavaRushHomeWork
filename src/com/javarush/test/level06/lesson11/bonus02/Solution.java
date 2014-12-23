package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта:
кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

/*public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandpaName = reader.readLine();
        Cat catGranpa = new Cat(grandpaName);

        String grandbaName = reader.readLine();
        Cat catGrandba = new Cat(grandbaName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGranpa);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandba, null);

        String sonName = reader.readLine();
        Cat Son = new Cat(sonName,catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGranpa);
        System.out.println(catGrandba);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(Son);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat parent;
        private Cat parent1;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat parent, Cat parent1)
        {
            this.name = name;
            this.parent = parent;
            this.parent1 = parent1;
        }

        @Override
        public String toString()
        {
            if (parent == null && parent1 == null)
                return "Cat name is " + name + ", no mother, no father";
            else if (parent1 == null)
                return "Cat name is " + name + ", mother is " + parent.name+ ", no father";
            else if (parent == null)
                return "Cat name is " + name + ", no mother, father is "+ parent1.name;
            else
                return "Cat name is " + name + ", mother is "+parent.name+", father is "+ parent1.name;
        }
    }

}*/
public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName);

        String granMotherName = reader.readLine();
        Cat catGrandMother = new Cat(granMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,catGrandFather,null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,null, catGrandMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);


        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.print(catDaughter);

    }

    public static class Cat
    {
        private String name;
        private Cat pap;
        private Cat mam;


        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat pap, Cat mam)
        {
            this.name = name;
            this.pap = pap;
            this.mam = mam;
        }

        @Override
        public String toString()
        {
            if (mam == null && pap == null)
                return "Cat name is " + name + ", no mother, no father";
            else if (mam == null)
                return "Cat name is " + name + ", no mother" + ", father is " + pap.name;
            else if (pap == null)
                return "Cat name is " + name + ", mother is " + mam.name + ", no father";
            else
                return "Cat name is " + name + ", mother is " + mam.name + ", father is " + pap.name;
        }
    }

}