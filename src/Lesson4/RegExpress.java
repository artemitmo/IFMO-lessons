package Lesson4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpress {
    public static void main(String[] args) {
        //шаблон, необходимый для проверки, поиска, замены, манипуляции со строками
        //для работы с регулярными выражениями
        //Pattern и Matcher - классы для работы с regular expressions
        String regEx = "Java Junior";
        String someStr = "Java Junior";
        Pattern pattern = Pattern.compile(regEx); // создали объект класса Паттерн
        Matcher matcher = pattern.matcher(someStr);
        matcher.matches();
        System.out.println(matcher.matches());
        // true если вся строка соответствует регулярному выражению, иначе - false;
        someStr = "Java Junior Developer";
        pattern = Pattern.compile("developer$", Pattern.CASE_INSENSITIVE); //заканчивается ли строка, регистро-нечувствительный
        matcher = pattern.matcher(someStr); //совпадение полностью
        System.out.println(matcher.find()); //вернет true если в строке есть подстрока, в которой есть регулярные выражения

        pattern = Pattern.compile("[a-x]");
        pattern = Pattern.compile("[ert]");
        matcher = pattern.matcher(someStr);
        while (matcher.find()) System.out.print(matcher.group());

        //a.+o dot-any symbol + one or more time

        System.out.println();
        someStr = "Java Junior Developer";
        pattern = Pattern.compile("a.+o"); //greedy searching
        matcher = pattern.matcher(someStr);
        while (matcher.find()) System.out.print(matcher.group());//до конца строки доходит и на обратке ищет О


        System.out.println();
        someStr = "Java Junior Developer";
        pattern = Pattern.compile("a.+?o"); //lazy searching
        matcher = pattern.matcher(someStr);
        while (matcher.find()) System.out.print(matcher.group());//до конца строки не доходит

        System.out.println();
        someStr = "Java Junior Developer";
        pattern = Pattern.compile("a.++o"); //свержадный searching
        matcher = pattern.matcher(someStr);
        while (matcher.find()) System.out.print(matcher.group());//до конца строки доходит false

        //группировка символов + опережающие и ретроспективные проверки

        someStr = "vnFn?gv.1976";
        regEx = "(?=.*[0-9])(?=.[A-Z]) [0-9A-Za-z./?]{3,}"; //круглые скобки для группировки, скобы для регулярных выражений
        pattern = Pattern.compile(regEx);
        matcher = pattern.matcher(someStr);
        System.out.println(matcher.find());
        while (matcher.find()) System.out.print(matcher.group());

        someStr = "Hi! What are you doing? My email is box@gmail.com. Flat football feature futurama. My phone-number: +7905-464-74-64";
        // ?= опережающая проверка
        // для email
        // найти все предложения в тексте (начинающиеся с заглавной буквы, оканчиваются на ? . !)
        regEx = "([A-Z].+?[?.!])";
        // найти все слова , начинающиеся на f
        regEx = "^f.*\b";
        // найти все слова (от 5 до 8 символов), начинающиеся на f
        regEx = "^f.*\b{5,8}";
        //номер телефона в формате +7xxx-xxx-xx-xx
        regEx = "^+7([0-9]{3}(-)([0-9]){2}(-)([0-9]){2})";

        pattern = Pattern.compile(regEx);
        matcher = pattern.matcher(someStr);
        System.out.println(matcher.find());
        while (matcher.find()) System.out.print(matcher.group());

        //имеются 2 строки. Найти количество вхождений одной строки в другую, вайл плюс счетчик.
        String str1 = "First";
        String str2 = "Second";

        //даны 2 слова, состоящие из четного количества букв. Нужно составить третье слово из первой половины 1го и второй половины второго
        //посмотреть, что скинуто в телеграмм

        //найти самое длинное слово в предложении (при условии, что все слова разной длины)
/*
^	начало строки
$	конец строки
\b	граница слова
\B	не граница слова
\A	начало ввода
\G	конец предыдущего совпадения
\Z	конец ввода
\z	конец ввода
 */

    }
}
