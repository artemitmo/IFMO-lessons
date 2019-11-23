package lesson12.task;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {
    public static Map<String, Integer> getWordsCount (List<String> words){
        Map<String, Integer> newMap = new HashMap<>();
        for (String word: words){
            if (newMap.containsKey(word)){
                newMap.put(word, newMap.get(word) + 1);
            }
            else  {
                newMap.put(word, 1);
            }
        }
        return newMap;
    }
}
