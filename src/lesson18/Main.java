package lesson18;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        int age = 2;
        String name = "Dog";
        Dog dog = new Dog(name, age);
        System.out.println(dog.getAge());
    }
}
//в стеке создается блок для метода Меин, начинается выполнение этого метода
//в стеке хранятся локальные переменные и ссылки на ссылочные переменные (объекты, методы)
//все объекты хранятся в другой области памяти
//инт переменная хранится и создается здесь же, потом создается ссылка на Name, сама строка идет в пул-строк
//потом идет вызов конструктора, создается блок для вызова конструктора
/*Блок для конструктора создается на вершине стека. В конструкторе происходит вызов метода - блок setName(), свою работу завершает,
* потом выполняется пара методов и меин завершается*/


class Dog{
    private String name;
    private int age;
    private LocalDateTime created;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        created = LocalDateTime.now();
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

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}
