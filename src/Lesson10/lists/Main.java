package Lesson10.lists;

import Lesson10.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("string 1");
        linkedList.add("string 2");
        linkedList.add("string 3");

        System.out.println(linkedList.get(2));
        Transport transport1 = new Transport("Moscow", "Tver", "322");
        Transport transport2 = new Transport("Moscow", "Tambow", "4042M");
        LinkedList <Transport> transportList = new LinkedList<>(); //можем хранить транспорт и его потомков, но не наоборот
        transportList.add(transport1);
        transportList.add(transport2);

        Bus bus1 = new Bus("Samara", "Ryazan", "2326P", true);
        transportList.add(bus1); //можно добавлять так

        Transport transportFromList = transportList.get(1);
        Bus busFromList = (Bus) transportList.get(2); //приведение к типу объекта, если не автобус, то эксепшн
    }
    public static Bus getFirst (LinkedList<? extends Transport> list){ //любой аргумент указанного типа данных
        Bus bus = new Bus("Moscow", "Tambow", "4042M", true);
        //list.add(bus);
        Transport transport = list.get(20);
        Object o = list.get(2);
        return (Bus)transport;
    }

    public void addToList (LinkedList<? super Transport> list){
        Bus bus = new Bus("Moscow", "Tambow", "4042M", true);
        list.add(bus);
    }
}
