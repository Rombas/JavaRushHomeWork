package com.javarush.test.level12.lesson06.task01;

/* Абстрактный класс Pet
Сделать класс Pet абстрактным.
*/

import com.sun.swing.internal.plaf.synth.resources.synth_sv;

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static abstract class Pet
    {
        public String getName()
        {
            return "Я - котенок";
        }
        
    }

}
