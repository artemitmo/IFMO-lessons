package Lesson4;
import java.util.Arrays;

public class FindBiggestWord{
    static String bigWord(String c) {
        String[] words = c.split(" |\\.|!"); //если точки, запятые и тд, ввести доп разделители
        int x = 0;
        for (int i = 0; i <words.length ; i++) {
            if (words[x].length()<words[i].length()){
                x = i;
            }
        }
        return words[x];
    }

    public static void main(String[] args) {
        System.out.println(bigWord("aaa  requerments. a mmmmm!we!!!!!! p"));
    }
}

