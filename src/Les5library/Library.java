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

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    // должна быть возможность взять книгу на дом, указав название
    public Book takeHome(int i) {
        getBooks()[i] = null;
        return getBooks()[i];
    }

    public String getInfo(int i){

        return "Книга найдена. Название: " + getBooks()[i].getTitle()  +
                " Автор: " + getBooks()[i].getTitle()  +
                ". Доступна в читальном зале/для выдачи на дом. " +
                " Для выдачи доступна/пока недоступна";
    }
}
