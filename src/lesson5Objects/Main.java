package lesson5Objects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book java = new Book(); //вызов конструктора после new
        Book claenCode = new Book(); //вызов конструктора после new
/*        java.title = "Философия Java"; //defines property (field String)
          claenCode.title = "Clean code ";//доступ к private String только внутри класса, так не достучаться
          java.author = "Bruce Ekkel";
          claenCode.author = "Robert Martin";*/
        java.setTitle("Философия Java");//передаем значения
        claenCode.setTitle("Clean code"); //передаем значения
        java.setAuthor("Bruce Ekkel"); //передаем значения
        claenCode.setAuthor("Robert Martin");//передаем значения
        java.setAvailable(false);
        java.setForHome(true);
        claenCode.setForHome(false);
        claenCode.setAvailable(false);

        //use a constructor
        Book forBeginners = new Book("Руководство для начинающих", "Герберт Шилдт");
        //после установки конструктора нового, по умолчанию перестает работать, если его не прописать руками
        //System.out.println(java); //переопределили метод toString для класса Book println вызывает toString() по умолчанию
        //System.out.println(claenCode);
        //System.out.println(forBeginners);
        Library library = new Library();
        library.addBook(java, claenCode, forBeginners);
        String java1 = library.getBooks()[0].getTitle();
        String clean1 = library.getBooks()[1].getTitle();
        String begin1 = library.getBooks()[2].getTitle();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите названия книги для поиска ");
        String bookName = input.nextLine();
        if (bookName.equals(library.getBooks()[0].getTitle())){
            System.out.println(library.getInfo(0));
        }
        else if (bookName.equals(library.getBooks()[1].getTitle())){
            System.out.println(library.getInfo(1));
        }
        else if (bookName.equals(library.getBooks()[2].getTitle())){
            System.out.println(library.getInfo(2));
        }
        else {
            System.out.println("Книги нет в наличие или она недоступна");
        }

        /*доделать методами
        на гитхабе лежат)
        public String getInfo (String title){
        }

         */
    }
}
