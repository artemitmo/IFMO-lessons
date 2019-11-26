package lesson14.io.training;

import java.io.*;
import java.util.ArrayList;

public class SerializationP {

    //@SuppressWarnings("unchecked")
    public static void main(String[] args) {

        String filename = "people.dat";
        // создадим список объектов, которые будем записывать
        ArrayList<Person1> people = new ArrayList<Person1>();
        people.add(new Person1("Tom", 30, 175, false));
        people.add(new Person1("Sam", 33, 178, true));

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename)))
        {
            oos.writeObject(people);
            System.out.println("File has been written");
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        // десериализация в новый список
        ArrayList<Person1> newPeople= new ArrayList<Person1>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
        {

            newPeople=((ArrayList<Person1>)ois.readObject());
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        for(Person1 p : newPeople)
            System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
    }
}
class Person1 implements Serializable{

    private String name;
    private int age;
    private double height;
    private boolean married;

    Person1(String n, int a, double h, boolean m){

        name=n;
        age=a;
        height=h;
        married=m;
    }
    String getName() {return name;}
    int getAge(){ return age;}
    double getHeight(){return height;}
    boolean getMarried(){return married;}
}