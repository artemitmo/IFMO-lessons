package lesson16lambda;

import java.util.function.Consumer;

public class UserConsumer {
    public static void main(String[] args) {
        UserFactory <User> factory = (name, age) -> new User (name, age);
        factory = User::new;
        User tom = factory.create("Tom", 44); //конструктор - реализация метода Create
        User tim = factory.create("Tom", 44); //конструктор - реализация метода Create
        //ссылка на конструктор класса User
        //под каждый конструктор можно создать интерфейс

        Consumer <User> update = user -> {
            user.setAge(22);
            user.setLogin("Paul");
        };
        update.accept(tom);
    }
}

interface UserFactory<T extends User>{ //функционал User
    T create(String login, int age);
}

class User{
    private String login;
    private int age;

    public User(String login, int age) {
        this.login = login;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
