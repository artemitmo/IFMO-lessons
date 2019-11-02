package Lesson8clone;

import Lesson8clone.object.Car;
import Lesson8clone.object.Owner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //родительский класс для всех классов, наследуется по умолчанию
        //все публичные методы, не приватные, будут доступны для всех наследников
        //toString() выозвращает строчку описания объекта
        //hashCode() возвращает хэш-код объекта
        //equals() проверяет на соответствие
        //clone() для создания копий
        Owner owner1 = new Owner("Tom", "+799");
        Owner owner2 = new Owner("Mike", "+788888");
        Owner owner3 = new Owner("Tom", "+799");
        //getClass() wait() и тд.
        Object obj = new Object();
        Car opel = new Car("Opel", "yellow", owner1);
        System.out.println(opel); //toString() переопределен

        //hashCode - адрес первоначальной ячейки памяти, может меняться периодически.
        // Переопределяем всегда в коллекциях и тд.
        Car mazda = new Car("Mazda", "red", owner2);
        Car opel2 = new Car("Opel","yellow", owner3);
        System.out.println(mazda.hashCode());
        System.out.println(opel.hashCode());
        System.out.println(opel2.hashCode());
        System.out.println(opel.equals(opel2));

        //метод clone() для создания копии объекта
        Object newCar = (Car)opel.clone();
        System.out.println(newCar.hashCode());
        System.out.println(opel.hashCode());

    }
}
