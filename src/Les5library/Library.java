package Les5library;
import java.util.Arrays;

public class Library {
    private Book[] books = new Book[10];
    public void addBook(Book... newBooks) { // в библиотеку можно добавить сразу несколько книг
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                System.arraycopy(newBooks, 0, this.books, i, newBooks.length);
                break;
            }
        }
    }

    // должна быть возможность взять книгу на дом, указав название
    /*public Book takeHome(String title) {
        Book returnBook = null;
        return returnBook;
    }*/

    public String getInfo(int m){

        return "Книга найдена. Название: " + getBooks()[m].getTitle()  +
                " Автор: " + getBooks()[m].getTitle()  +
                ". Доступна в читальном зале/для выдачи на дом. " +
                " Для выдачи доступна/пока недоступна";
    }
}
