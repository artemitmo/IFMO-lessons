package lesson5Objects;

import java.util.Arrays;

public class Library {
    private Book[] books = new Book[10]; //создали массив из 10 ссылок на объекты класса Book (default = null)

    //в библиотеку можно добавить 1 книгу
    public void addBook(Book newBook) { //закидываем 1 книгу
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                this.books[i] = newBook;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }

    public void addBook(Book... newBooks) { // в библиотеку можно добавить сразу несколько книг
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                System.arraycopy(newBooks, 0, this.books, i, newBooks.length);
                break;
            } //здесь происходит перегрузка методов ...
        }
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    // должна быть возможность взять книгу на дом, указав название
    public Book takeHome(String title) {
        Book returnBook = null;
        return returnBook;
    }

    public String getInfo(int m){
        return "Книга найдена. Название: " + getBooks()[m].getTitle()  +
                " Автор: " + getBooks()[m].getTitle()  +
                "Доступна в читальном зале/для выдачи на дом " +
                "Для выдачи доступна/пока недоступна";
    }




}