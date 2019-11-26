package lesson14.io.training;
import java.io.*;

public class FileOutputStreamTrain {

    public static void main(String[] args) throws FileNotFoundException {

        String text = "Hello world! One more time! "; // строка для записи
        try(FileOutputStream fos=new FileOutputStream("C://SomeDir//notes.txt", false)) //указываем путь на запись файла
                //false - файл полностью перезаписывается
        {
            byte[] buffer = text.getBytes(); // перевод строки в байты
            fos.write(buffer, 0, buffer.length); //запись в файл, метод write() FileOutputStream,
            // передаем переведенные в байты тексты и до конца с нуля до длины buffer
        }
        catch(IOException ex){ //ловим ошибку IO и выводим ее сообщение на экран
            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written"); //файл записан

        /*PrintWriter
        На PrintStream похож другой класс PrintWriter. Его можно использовать как для вывода информации на консоль,
        так и в файл или любой другой поток вывода. Данный класс имеет ряд конструкторов:
        PrintWriter(File file): автоматически добавляет информацию в указанный файл
        PrintWriter(File file, String csn): автоматически добавляет информацию в указанный файл с учетом кодировки csn
        PrintWriter(OutputStream out): для вывода информации используется существующий объект OutputStream, автоматически сбрасывая в него данные
        PrintWriter(OutputStream out, boolean autoFlush): для вывода информации используется существующий объект OutputStream,
         второй параметр указывает, надо ли автоматически добавлять в OutputStream данные
        PrintWriter(String fileName): автоматически добавляет информацию в файл по указанному имени
        PrintWriter(String fileName, String csn): автоматически добавляет информацию в файл по указанному имени, используя кодировку csn
        PrintWriter(Writer out): для вывода информации используется существующий объект Writer, в который автоматически идет запись данных
        PrintWriter(Writer out, boolean autoFlush): для вывода информации используется существующий объект Writer,
         второй параметр указывает, надо ли автоматически добавлять в Writer данные
        PrintWriter реализует интерфейсы Appendable, Closable и Flushable, и поэтому после использования представляемый им поток надо закрывать.
        Для записи данных в поток он также используется методы printf() и println().
                Например, применим данный класс для вывода на консоль:*/

        try(PrintWriter pw = new PrintWriter("C://SomeDir//notes.txt")) //указываем куда записываем
        {
            pw.println("Hello world! + дозаписали");
        }
    }
}
