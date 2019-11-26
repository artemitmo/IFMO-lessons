package lesson14.io.training;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTrain {

    public static void main(String[] args) {
//копирование данных с файла в новый файл
        try(FileInputStream fin=new FileInputStream("C://SomeDir//notes.txt");
            FileOutputStream fos=new FileOutputStream("C://SomeDir//notes_new.txt")) //автозакрытие 2х потоков реализовано
        {
            byte[] buffer = new byte[fin.available()]; //создаем массив с количеством элементов по числу байтов в тексте
            // считываем буфер
            fin.read(buffer, 0, buffer.length);
            // записываем из буфера в файл
            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}