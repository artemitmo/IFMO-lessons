package Lesson4RegEX;

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
        int c = (int)(java.lang.System.currentTimeMillis()*100);
        System.out.println(bigWord("aaa  requerments. a mmmmm!we!!!!!! p"));
        int d = (int)(java.lang.System.currentTimeMillis()*100);
        System.out.println("Время выполнения " + (d-c));
    }
}

