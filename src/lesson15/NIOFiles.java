package lesson15;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class NIOFiles {
    public static void main(String[] args) {
        //NIO
        //Каналы Channel
        //Селекторы Selector
        //Буферы Buffer
        //Кодировки Charset / StandartCharset
        //Начиная с 7 версии пакет files для работы с файловой системой: Path + Files посмотреть по документации все методы, знать ВСЕ!!!!
        //3 класса - разобраться с каждой строчкой

        //Каналы:
        //FileChannel - с канала пишем, с канала читаем, файлинпутстрим и аутпут,  fileInputStream.getChannel(),fileOutStream.getChannel() - можем получить объект канала
        //DatagramChannel - передача данных по ubd-протоколу
        //SocketChannel и ServerSocketChannel - клиентский сокет, второй серверный

        File file = new File("nio.txt");
        if (!file.exists()){
            try{
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            writeToFile(file.toPath(), "String");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile (Path path, String string) throws IOException {
       // Files.write(path, string.getBytes(), StandardOpenOption.APPEND); //есть готовая реализация, но лучше использовать свою, см.ниже
        try(FileChannel fileChannel = (FileChannel) Files.newByteChannel(path, StandardOpenOption.APPEND)) {//вызов метода у статического класса Файлз
            ByteBuffer byteBuffer = ByteBuffer.allocate(string.getBytes().length); //создаем на размер записываемой строки
            byteBuffer.put(string.getBytes(StandardCharsets.UTF_8)); //добавляем с кодировкой утф-8, позиция на лимите
            byteBuffer.flip(); //позиция в ноль отправляется
            fileChannel.write(byteBuffer); //пишем из буфера в канал. Канал соединен с файликом


        }
    }

    public static void readFromFile (Path path) throws Exception{
        try(FileChannel fileChannel = (FileChannel) Files.newByteChannel(path, StandardOpenOption.APPEND)) {//вызов метода у статического класса Файлз
            ByteBuffer byteBuffer = ByteBuffer.allocate(512);
            while (fileChannel.read(byteBuffer) > 0){ //читаем из файла в буфер, когда -1 - то остановится
                byteBuffer.flip();
                for (int i = 0; i <byteBuffer.limit() ; i++) {
                    System.out.println((char) byteBuffer.get()); //собираем и выводим на экран
                }
                byteBuffer.clear();
            }
        }
        List<String> lines = Files.readAllLines(path);
        Files.lines(path, StandardCharsets.UTF_8).forEach(System.out::println);
    }


}
