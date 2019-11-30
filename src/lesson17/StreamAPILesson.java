package lesson17;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPILesson {
    public static void main(String[] args) {
        //StreamAPI появился в 8й версии языка, необходим для работы с потоком данных
        //Потоки работают с данными, но их не хранят, есть набор методов
        //Методы делятся на промежуточные (обрабатывают данные и возвращают Stream-объект)
        //stream.промежуточный().промежуточный().промежуточный()... - без терминального работать не будет
        //терминальные, не возвращают объект стрим
        //stream.method1().промежуточный().промежуточный().промежуточный() - замыкает все и завершает работу промежуточных методов
        //обработка идет по цепочке, начиная с первой
        //Некоторые методы получения Стрим-объектов
        //из коллекции collection.stream() - возвращает стрим объект
        //из массива Arrays.stream(arr) - передаем массив и возвращается объект на основе этого массива
        //из файла Files.lines(path_to_file) - каждый элемент будет строкой
        //из строки получаем поток чаров string.chars();
        //используя builder - Stream.builder().add(obj1).add(obj2)....build(); можно добавить кучу объектов одного типа
        //Stream.of(1, 4, 7); - все будут объекты стрим

        Stream<Integer> integerStream = Stream.of(6, 9, 15, 90, -17, -18, -79); //стрим из чисел
        integerStream.filter(num -> num < 0) //предикатом проверяет и возвращает новый стрим с элементами, прошедшими проверку на условие
                .map(num -> num * 10) //принимает на вход функцию, обработает только -17, -18, -79 и вернет их умножиными на 10. Вернет Стрим.
                //смотреть как лучше разместить методы, чтобы меньше загружать ресурсы
                .limit(2) //берет указанное количество и оставляет в Стриме
                .forEach(System.out::println); //терминальный оператор выводит на печать
        System.out.println();

        integerStream = Stream.of(5, 7, 7, 89, 16, -89);
        integerStream.distinct() //возвращает не дублирующиеся элементы
                .sorted() //сортировка в натуральном порядке, если не указан порядок
                .forEach(System.out::println);

        //anyMatch | allMatch | noneMatch
        integerStream = Stream.of(6, 4, 11, -8, 0, 14); //принимает предикат
        System.out.println(integerStream.anyMatch(num -> num == 0));
        //терминальный оператор, выводит тру или фолз, если хотя бы 1 элемент соответствует условию
        //allMatch - тоже принимает предикат, но возвращает тру, когда все значения тру
        //noneMatch - тру когда все значения фолз

        String[] stringsArr = {"aa", "bb", "cc", "dd"};
        //findFirst | findAll пройтись по оберткам, 1 - находит первый элемент, потом обощение создает из нашего объекта методом get
        Arrays.stream(stringsArr).findFirst().get();
        //создаем поток из массива строк, возвращает optional<T> get - возвращает 1ю строчку из стрима, если там нал - вернет нал
        Arrays.stream(stringsArr).findFirst().orElse("Значение по умолчанию, что возвращает, если null");
        Arrays.stream(stringsArr).findFirst().isPresent(); //если налл - то фолз, если норм - то тру)

        Arrays.stream(stringsArr).skip(2) //пропускает указанное количество элементов (выкидывает)
                .filter(str -> str.startsWith("c")) //фильтрует по тру-фолз (Предиктейт)
                .forEach(System.out::println);


        ArrayList<User> users = new ArrayList<>();
        users.add(new User("qwwe", 34));
        users.add(new User("asd", 56));
        users.add(new User("zxc", 18));
        users.add(new User("zxc", 18));
        users.add(new User("pwe", 11));
        users.add(new User("ty", 14));

        //массив пользователей старше 25
        User[] userArr = users.stream().filter(user -> user.getAge() > 25).toArray(User[]::new); //new User[]

        List <User> userslist = users.stream().filter(user -> user.getAge() <25).peek(user -> user.setActive(true)).collect(Collectors.toList());

        //Set<User> самому написать
        Set <User> userSet = users.stream().collect(Collectors.toSet()); //множеству не нужно distinct and sorted
        System.out.println("Вот оно");
        userSet.forEach(System.out::println);

        ArrayList <User> userArrayList = users.stream().distinct().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toCollection(ArrayList::new));
        //идет преобразование Эрейлиста
        //userArrayList.forEach(f -> System.out.println(f)); вывод

        User minUser = users.stream().min(Comparator.comparing(User::getName)).orElse(new User("default", 0));
        //компаратором задаем порядок и получаем максимальное значение
        User maxUser = users.stream().min(Comparator.comparing(User::getName)).orElse(new User("default", 100));


        //отдельно про Мапу

        String[] stringArr2 = {"aaa", "cc", "cc", "bd"};
        Map<String, Integer> map = Arrays.stream(stringArr2).collect(Collectors.toMap(Function.identity(), String::length, (item1, item2) -> item1));
        //формирует МАпу из массива строк
        //метод коллект берет каждый элемент и возвращать элемент мапы, определяет длину этой строки и присваивает ключ
        //в лямбде описан выбор между дублирующимися ключами
        System.out.println(map);
        System.out.println("Преобразование лист");
        List<String> stringList2 = Arrays.asList("34","58","78");
        stringList2.stream().flatMap(num -> Stream.of(Integer.parseInt(num))).forEach(System.out::println);



        Stream<Integer> integerStream1 =Stream.of(1, 2  ,3, 4);
        Optional<Integer> optional = integerStream1.reduce((x, y) -> x + y); //возвращает объект типа optional
        //манипуляция с соседними элементами, складывает и запоминает результат
        System.out.println(optional.get()); //10 1+2+3+4 терминальный оператор гет

        Stream<String> stringStream = Stream.of("Java", "Junior");
        String res = stringStream.reduce("Result: ",(x,y)-> x + " " + y); //манипуляция с соседними элементами
        System.out.println(res); //

        integerStream1=Stream.of(1, -2, -3, -4);
        int result = integerStream1.reduce(0, (x, y) -> { //в первой части описываем как делаем, во второй что делать
            if (x<0 || y<0) return 0;
            else return x+ y;
        }, (x,y) -> x+y );
        System.out.println(result);
    }

//Spliterator




        static class User {
            private String name;
            private int age;
            private boolean active;

            public User(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }
            public void setName(String name) {
                this.name = name;
            }
            public int getAge() {
                return age;
            }
            public void setAge(int age) {
                this.age = age;
            }
            public boolean isActive() {
                return active;
            }
            public void setActive(boolean active) {
                this.active = active;
            }

            @Override
            public String toString() {
                return "User{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", active=" + active +
                        '}';
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof User)) return false;
                User user = (User) o;
                return getAge() == user.getAge() &&
                        active == user.active &&
                        Objects.equals(getName(), user.getName());
            }

            @Override
            public int hashCode() {
                return Objects.hash(getName(), getAge(), active);
            }
        }
    }