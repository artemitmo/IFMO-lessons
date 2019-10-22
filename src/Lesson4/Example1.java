package Lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static void main ( String[] args ) {
        String text = "Hi? I'm Andrew. My email is andr@gmail.com. I'm from Spain. stoke@mail.ru is brothers email";
        Pattern search = Pattern.compile("\\w+@(mail|gmail)\\.(com|ru)");
        Matcher matcher = search.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
            }
        }
    }
