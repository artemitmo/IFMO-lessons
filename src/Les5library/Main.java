package Les5library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book java = new Book("Философия Java", "Gerbert Shildt", true, true);
        Book cleanCode = new Book("Clean code", "Rober Martin", true, true);
        Book forBeginners = new Book("Руководство для начинающих", "Герберт Шилдт", true, true);
        Library l1 = new Library();
        l1.addBook(java, cleanCode, forBeginners);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги для поиска ");
        String title = scanner.nextLine();

        for (int i = 0; i < l1.getBooks().length; i++) {
            if (l1.getBooks()[i].getTitle().equals(title)) {
                System.out.println(l1.getInfo(i));
                System.out.println("Взять книгу на дом? +|- ");
                String reply = scanner.nextLine();
                if (reply.equals("+")){
                    l1.takeHome(i);
                    System.out.println("Книга взята Вами на дом и перестает быть доступной в библиотеке ");
                }
                else if (reply.equals("-")){
                    System.out.println("Книга будет доступна для взятия на дом");
                }
                else {
                    System.out.println("");
                }
                break;
            }
        }
    }
}