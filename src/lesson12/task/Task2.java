package lesson12.task;

import lesson12.MapLesson;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class Task2 {
    ClassLoader loader = MapLesson.class.getClassLoader();
    File file = new File(loader.getResource("wp.txt").getFile());
    List <String> strings = Files.readAllLines(file.toPath()); //получаем лист строк
    LinkedList<String> linkedList = (LinkedList<String>) strings;
    public Task2() throws IOException {
    }
    //каждая строка файла - отдельный элемент списка
    //map хранит имя

    public static void main(String[] args) throws IOException {
        Task2 task2 = new Task2();
        System.out.println(task2.linkedList);
        /*Map <Integer, String> bookMap = new HashMap<>();
        Task2 task2 = new Task2();
        int i = -1;
        for (String str: task2.strings
        ) {bookMap.put(i++, str);
        }
        System.out.println(bookMap);*/
    }
}
