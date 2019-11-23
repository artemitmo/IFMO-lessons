package Lesson11.task;

import java.util.*;

public class Task {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();
        set.add(15);
        set.add(14);
        set.add(1);
        set.add(2);
        set.add(6);
        set.add(5);
        set.add(4);
        set.add(3);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(16);
        set.add(17);
        set.add(18);
        set.add(19);
        set.add(20);

        for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext(); )
            if (iterator.next() > 10)
                iterator.remove();
        System.out.println(set);
        }
}
