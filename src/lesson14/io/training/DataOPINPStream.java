package lesson14.io.training;
import java.io.*;

public class DataOPINPStream {
    /*Объект DataOutputStream в конструкторе принимает поток вывода: DataOutputStream (OutputStream out).
     В данном случае в качестве потока вывода используется объект FileOutputStream, поэтому вывод будет происходить в файл.
     И с помощью выше рассмотренных методов типа writeUTF() производится запись значений в бинарный файл.
    Затем происходит чтение ранее записанных данных.
    Объект DataInputStream в конструкторе принимает поток для чтения: DataInputStream(InputStream in).
     Здесь таким потоком выступает объект FileInputStream*/

    public static void main(String[] args) {

        Person tom = new Person("Tom", 34, 1.68, false);
        // запись в файл
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin")))
        {
            // записываем значения
            dos.writeUTF(tom.name);
            dos.writeInt(tom.age);
            dos.writeDouble(tom.height);
            dos.writeBoolean(tom.married);
            System.out.println("File has been written");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        // обратное считывание из файла
        try(DataInputStream dos = new DataInputStream(new FileInputStream("data.bin")))
        {
            // записываем значения
            String name = dos.readUTF();
            int age = dos.readInt();
            double height = dos.readDouble();
            boolean married = dos.readBoolean();
            System.out.printf("Name: %s  Age: %d  Height: %f  Married: %b",
                    name, age, height, married);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}

class Person
{
    public String name;
    public int age;
    public double height;
    public boolean married;

    public Person(String n, int a, double h, boolean m)
    {
        this.name=n;
        this.height=h;
        this.age=a;
        this.married=m;
    }
}
