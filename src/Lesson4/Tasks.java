package Lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tasks {
        public static void main (String[]args){
            ////имеются 2 строки. Найти количество вхождений одной строки в другую, вайл плюс счетчик
            String first = " ha yellow green ha";
            String second = "ha";
            Pattern searching = Pattern.compile(second);
            Matcher matcher = searching.matcher(first);
            int i = 0;
   /*    while (matcher.find()){
           i++;
           System.out.println(matcher.group());
       }
        System.out.println(i);*/
            ///даны 2 слова, состоящие из четного количества букв. Нужно составить третье слово из первой половины 1го и второй половины второго
            String a = "animal";
            String b = "poison";
            String c = a.substring(a.length() / 2);
            String d = b.substring(b.length() / 2);
            System.out.println(c + d);
        }
}
