package Lesson3;

//на гитхабе посмотреть в первом лесоне по свитчу в

import java.util.Arrays;
import java.util.StringJoiner;

public class Les3 {
    public static void main(String[] args) {
        //до 9 версии представлялись как массив char, каждый символ занимает 2 байта, кодировка УТФ-16
        //начиная с 9 версии - компактные строки, хранятся как byte[] 1 байт - LATIN-1, 2 bytes - UTF-16 + byte coder of String
        //byte LATIN1=0; byte UTF-16 = 1;
        /*Строки в Java неизменны и потокобезопасны, все преобразования создают новую строку
         */

        char[] charsArr = {'j','b', 'c'};
        String str = new String(charsArr);
        String str1 = "Java";
        String str3 = "Java"; //вторая ссылка на один и тот же объект
        String str2 = new String("Java");
        String str4 = str2.intern(); //объект строки создается в пуле строк (если такой строки нет). Если строка есть в пуле строк, то возвращается ссылка на него

        //str3.codePoints().forEach(System.out::println);
        //выводит символы кодировки
        //количество символов в строке
        System.out.println("Количество символов в строке " + str3.length());
        //сравнение строк
        str = "JAVA";
        str1 = "Java";
        System.out.println(str.equals(str1)); //false
        System.out.println(str.equalsIgnoreCase(str1)); // без учета регистра // true
        int compareRes = str.compareTo(str1);
        System.out.println("compareTo " + compareRes);
        compareRes = str.compareToIgnoreCase(str1); // 0- если строки равны, положительное - если первая строка следует за второй, отрицательное - наоборот
        System.out.println("compareToIgnoreCase " + compareRes); //посмотреть в таблице символов

        System.out.println(str.startsWith("JA")); //true or false
        System.out.println(str.endsWith("J"));

        //IndexOf("символ") - для поиска первого вхождения указанного символа, возвращает индекс вхождения либо подстроки, если а искать, то вернет 1
        //lastIndexOf("символ")  - для поиска последнего вхождения указанного символа, возвращает индекс вхождения либо подстроки, если а искать, то вернет 3
        //подсрока - слова или сивол отдельный

        System.out.println(str.indexOf("V")); //индекс
        System.out.println(str.indexOf("V", 2)); //индекс подстроки

        str = "Java Junior Developer";
        str1 = "Java";
        System.out.println(str.contains(str1)); //содержится строка  в строке
        System.out.println(str1.contains(str)); //содержится строка  в строке

        //Модификация строк состоит в создании новой строки, потому что строки не меняются

        //toLowerCase() - в нижний регистр и возвращает новую строчку, создается строка в нижнем регистре
        String lowerCase = str.toLowerCase();
        //toUpperCase() - в верхний регистр и возвращает новую строчку, создается строка в нижнем регистре
        String upperCase = str.toUpperCase();

        //str.trim() - убирает пробелы
        //reverse() - меняет порядок в обратном направлении
        String newStr = str.replace("Junior", "Seniour");
        System.out.println(newStr);
        String newStr2 = str.replaceAll( "v","b");
        System.out.println(newStr2);

        str = "Java Junior Developer";
        String[] strings = str.split("\\s");
        System.out.println(Arrays.toString(strings));

        //substring(int begin, int end) - взятие подстроки
        //substring (int begin) - взятие подстроки

        System.out.println(str.substring(2));
        System.out.println(str.substring(2, 10));

        //конкатенация строк
        String concatString = "Java " + "Developer";
        System.out.println(concatString);

        concatString = concatString.concat(" + Junior");
        System.out.println(concatString); //в цикле не использовать ни тот и не этот метод, метод работает через массив, работают по-разному
        //в циклах создает слишком много объектов и перегружает систему

       /* str = "String";
        for (int i = 0; i <7 ; i++) {
            str += " iteration " + i; //создается новый объект
        }*/

       //Классы для работы со строками (с возможностью изменения строк) //StringBuilder and StringBuffer
        //через них менять можно строки без создания новых объектов
        //StringBuilder работает быстрее, чем StringBuffer, но не потокобезопасен.
        str = "String";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        for (int i = 0; i <7 ; i++) {
            stringBuilder.append(" iteration ").append(i);
        }
        str = stringBuilder.toString();
        System.out.println(str); // + после 9й версии java работает быстрее

        //объединение
        StringJoiner joiner = new StringJoiner(", "); //объединение строк по разделителям
        joiner.add("One");
        joiner.add("Two");
        String joinString = joiner.toString();
        System.out.println(joinString); // One, Two

        /*текстовые блоки в 13й версии String textBlock =              !!!
        """
            Строка "в кавычках"
            с переносами
        """;


         */
    }

}
