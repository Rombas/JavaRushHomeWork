package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //Напишите тут ваш код
        SimpleDateFormat sf = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat sd = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date date = sf.parse(reader.readLine());
        String newdate = sd.format(date);
        System.out.println(newdate.toUpperCase());
    }
}
