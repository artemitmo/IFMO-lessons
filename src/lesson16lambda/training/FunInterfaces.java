package lesson16lambda.training;

import java.util.function.*;

public class FunInterfaces {
    public static void main(String[] args) {
        Predicate<Integer> pre = x -> x>15;
        System.out.println("Predicate " + pre.test(16));


        BinaryOperator<Integer> biO = (a, b) -> a*b;
        System.out.println("BinaryOperator " + biO.apply(15, 20));

        UnaryOperator<Integer> square = c -> c*c;
        System.out.println(square.apply(5)); // 25

        Function<Integer, String> convert = d-> String.valueOf(d) + " долларов";
        System.out.println(convert.apply(5)); // 5 долларов
        //Функциональный интерфейс Function<T,R> представляет функцию перехода от объекта типа T к объекту типа R


        Consumer<Integer> printer = e-> System.out.printf("%d долларов \n", e);
        printer.accept(600); // 600 долларов
        //Consumer<T> выполняет некоторое действие над объектом типа T, при этом ничего не возвращая

        //Supplier<T> не принимает никаких аргументов, но должен возвращать объект типа T:
        /*import java.util.Scanner;
import java.util.function.Supplier;

public class LambdaApp {

    public static void main(String[] args) {

        Supplier<User> userFactory = ()->{

            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя: ");
            String name = in.nextLine();
            return new User(name);
        };

        User user1 = userFactory.get();
        User user2 = userFactory.get();

        System.out.println("Имя user1: " + user1.getName());
        System.out.println("Имя user2: " + user2.getName());
    }
}
class User{

    private String name;
    String getName(){
        return name;
    }

    User(String n){
        this.name=n;
    }
}*/
    }
}
