package Lesson4;

import java.util.Arrays;

public class Spliter {
    public static void main(String[] args) {
        String a = "Hello.there guys";
        String[] b =a.split("\\.| ");
        System.out.println(Arrays.toString(b)); //split . and " "
        String c = "Hello44there55guys";
        String[] d =c.split("\\d+");
        System.out.println(Arrays.toString(d));

        System.out.println(c.replaceAll("\\d+", " "));
        //replaceAll takes a regEx, replace - only Strings
    }
}
