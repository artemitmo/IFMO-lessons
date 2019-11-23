package lesson12;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class MapLesson {
    //Не имеют отношения к коллекциям, интерфейс Map, в зависимости от задач используются
    //Рассматриваем сегодня Тримап, ХэшМап
    public static void main(String[] args) throws IOException {
        User user1 = new User("qwwee", "123", Role.USER);
        User user2 = new User("asd", "456", Role.ADMIN);
        User user3 = new User("mpr", "789", Role.USER);
        User user4 = new User("stn", "012", Role.ADMIN);

        System.out.println("---HashMap---");
        //для объектов, которые используются в качестве ключей обязательно должны быть переопределены методы equals and hashCode()
        //null можно использовать в качестве ключа
        //порядок в зависимости от добавления не сохраняется
        //в дженерике указываем тип ключа, затем значения
        HashMap <String, User> userHashMap = new HashMap<>();
        userHashMap.put(user1.getLogin(), user1); //ключ, потом значение
        userHashMap.put(user2.getLogin(), user2);
        userHashMap.put(user3.getLogin(), user3);
        userHashMap.put(user4.getLogin(), user4);
        userHashMap.put(null, null);
// ключи должны быть уникальные, замена при одинаковых ключах

        userHashMap.remove("asd");
        userHashMap.remove("stn");
        System.out.println(userHashMap);
        System.out.println(userHashMap.get("asd"));

    for (Map.Entry<String, User> entry: userHashMap.entrySet())
    System.out.println(entry.getKey() + " : " + entry.getValue());

        System.out.println("---EnumMap---");
        //enum используется в качестве ключей
        //нулл нельзя использовать в качестве ключа
        EnumMap<Role, ArrayList<User>> enumMap = new EnumMap<>(Role.class);
        enumMap.put(Role.USER, new ArrayList<>(Arrays.asList(user1, user3)));
        enumMap.put(Role.ADMIN, new ArrayList<>(Arrays.asList(user2, user4)));
        System.out.println(enumMap);
        System.out.println(enumMap.get(Role.USER));

        User user5 = new User("newUser", "444", Role.USER);
        //метод гет по ключу возвращает значение

        enumMap.get(user5.getRole()).add(user5); //передаем ключ и принимаем объект в нужный массив
        //по ключу юзер, мы добавляем объект
        System.out.println(enumMap.get(Role.USER));


        WeakHashMap<Object, String> weakHashMap = new WeakHashMap<>();
        //удаляются объекты, если после сборки мусора

        System.out.println("---TreeMap---");
        //сортировка по ключам
        //null не может быть использован в качестве ключа
        TreeMap <String, User> treeMap = new TreeMap<>();
        //все то же самое, что и для трисет
        //основан на красно-черном дереве
        //сортировка по ключам
        //null не может быть использован в качестве ключа
        treeMap.put(user1.getLogin(), user1);
        treeMap.put(user2.getLogin(), user2);
        treeMap.put(user3.getLogin(), user3);
        System.out.println(treeMap);
        //если используем собственные объекты как ключи, то нужно определить сравнение
        //разобраться с методами add, get и тд



    }

}
