package Lesson4RegEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTraining {
    public static void main(String[] args) {
        String str1 = "+711";
        String regex = "(-|\\+)?\\d+";
        str1 = "gas13254656";
        regex = "[a-zA-z]+\\d+"; //any quantity English liters
        str1 = "13gas1325465611";
        regex = "[a-zA-z31]+\\d+"; //перед цифрами еще и определенные цифры
        regex = "[a-zA-z31]+\\d+"; //true
        str1 = "hello"; //if includes a - false
        regex = "[^abc]*"; //true
        str1 = "http://www.google.com"; str1 = "hi 123 http://www.yandex.ru";
        regex = "http://www.*\\.(com|ru)";
        //str1 = "123";   regex = "\\d{3}"; //true
        /*
        \\d - одна цифра \\d+ - 1 или более цифра
        \\d* - 0 или более (на пустоте true)
        -\\d* - with minus  ?- -> 0 или 1 символов до (- +)
        () - в скобках описываются вероятные вещи +|\\- here + or -
        [a-zA-z] all alphabet or (a|b|c|d) == [abcd]  [0-9] == \\d
        [^abc]отрицание все, кроме abc  ( . - любой символ )
        {2} {2, 6} - точное количество предыдущих символов {2, } до бесконечности
        \\w - одна буква [a-zA-z]


         */
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str1);
        matcher.matches();
        System.out.println(matcher.matches());
        while (matcher.find()) System.out.println(matcher.group());
        //true если вся строка соответствует регулярному выражению, иначе - false;
    }
}
