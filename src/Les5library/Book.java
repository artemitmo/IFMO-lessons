package Les5library;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    private boolean isForHome;

    public String getTitle () {
        return title;
    }

    public void setTitle ( String title ) {
        this.title = title;
    }

    public String getAuthor () {
        return author;
    }

    public void setAuthor ( String author ) {
        this.author = author;
    }

    public boolean isAvailable () {
        return isAvailable;
    }

    public void setAvailable ( boolean available ) {
        isAvailable = available;
    }

    public boolean isForHome () {
        return isForHome;
    }

    public void setForHome ( boolean forHome ) {
        isForHome = forHome;
    }

    public Book ( String title, String author, boolean isAvailable, boolean isForHome) {
        this.author = author;
        this.title = title;
        this.isAvailable = isAvailable;
        this.isForHome = isForHome;
    }
}


