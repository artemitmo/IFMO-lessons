package lesson14.io.messages;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Properties;
import java.util.Scanner;

public class MessageClient {
    private String server;
    private int port;
    private Scanner scanner;

    public MessageClient(String server, int port) {
        this.server = server;
        this.port = port;
        this.scanner = new Scanner(System.in);
    }

    public void start(){
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        String messageText;
        while (true){
            System.out.println("Введите сообщение");
            messageText = scanner.nextLine();
            try {
                sendAndGetMessage(name, messageText);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void sendAndGetMessage(String name, String messageText) throws Exception {
        try (Connection connection = new Connection(new Socket(server, port))){ //класс должен обязательно имплементировать интерфейс
            Message message = new Message(name, messageText);
            connection.sendMessage(message); //метод в потоке записывает объект

            message = connection.readMessage();
            System.out.println("ответ от сервера: " + message);
        }
    }


    public static void main(String[] args) {
        try (InputStream inputStream = MessageClient.class.getClassLoader().getResourceAsStream("config.properties")){ //передаем объект - тектовый файл в папке resource

            Properties properties = new Properties();
            properties.load(inputStream); //загружается инфа из файла и читается
            String server = properties.getProperty("server");//"127.0.0.1"; данные из файла, находит ключ и выдает значение
            int port = Integer.parseInt(properties.getProperty("port")); //8090; данные из файла, находит ключ и выдает значение, парсинг к Инт
            //файл специальный ключ = значение, расширение пропертиз,
            System.out.println(server);
            MessageClient messageClient = new MessageClient(server, port);
            messageClient.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


