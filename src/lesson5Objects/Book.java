package lesson5Objects;

public class Book {
    //свойства объекта,поля, атрибуты, если не описать в классе, то не сможем их задать в объекте
    private String title; //null все названия по умолчанию
    private String author;//private модификатор, говорит о том, что доступ только внутри класса
    private boolean isAvailable;
    private boolean isForHome; //по умолчанию фолс

    public Book() {};

    //конструктор public Book(){} по умолчанию, по своей сути метод, инициализирующий поля. Всегда носит имя метода
    public Book(String title, String author){
        setTitle(title);
        setAuthor(author);
    }

    public Book (String title, String  author, boolean isAvailable, boolean isForHome){};


    public boolean getIsAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
    public boolean getIsForHome() {
        return isForHome;
    }
    public void setForHome(boolean forHome) {
        isForHome = forHome;
    }
    //метод, устанавливающий значения свойст title and author
    public void setTitle(String title){ //выполняет действия, значения не возвращается void, принимает
        if (title != null && !"".equals(title))
        this.title = title; //ссылка на текущий объект, если у Джавы то this джава, если Сlean Code - то он this
    }
    public String getTitle() { //метод возвращает значения свойств, генерируются с Generate
        return title; //прекращает работу метода и возвращает указанное значение, после ретурна ничего выполнено не будет, в войде прекращает работу просто
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                ", isForHome=" + isForHome +
                '}';
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

//Java строится на совокупности объектов. При этом каждый объект - экземпляр определенного класса.
    /*1. Выделяем объекты и связи между ними (на концептуальном уровне). Бесполезные объекты не нужны. Каждый тип объекта обладает своей сферой ответственности.
         Пример, Месседжер - объекты сообщения и тд.., пользователи.
     2. Описание классов - пишем свойства будущих объектов, созданных из него и общие методы. В классах описываем свойства.
     3. Создание объектов.
     Система учета книг в библиотеке:
     Для каждой книги должны быть указаны: автор, название, можно ли брать на дом или в читальном зале, если книга взята - то книга недоступна (отметка)
     Книги хранятся в библиотеке. В библиотеку можно добавить 1 книгу, несколько книг. Должна быть возможность получить информацию по книге (сообщение)
     Информация: автор, название, можно ли взять домой, доступность. Если книга не найдена, сообщаем, что не найдена).
     должна быть возможность взять на дома, указав название
     должна быть возможность почитать в читальном зале, указав название
     */
