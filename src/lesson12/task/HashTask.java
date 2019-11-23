package lesson12.task;

import java.util.HashMap;
import java.util.Map;

public class HashTask {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Yellow");
        map.put(2, "Yellow");
        map.put(3, "Yellow");
        map.put(4, "Yellow");
        map.put(5, "Yellow");
        int count = 0;
        for (Map.Entry<Integer, String> entry: map.entrySet()
             ) {if (entry.getValue().equals("Yellow")){
            count++;
        }

        }
        System.out.println(count);
    }
}
