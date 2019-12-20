package lesson13;

public class Message {
    private String title;
    private String text;

    public Message(String title, String text) throws CheckedException {
        setTitle(title);
        setText(text);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws CheckedException {
        if (title == null || title.trim().length() < 3) {
//            throw new UncheckedException("Длина менее 3 символов");
            throw new CheckedException("Длина менее 3 символов");
        }
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) throws CheckedException {
        if (text == null || text.trim().length() < 10) {
//            throw new UncheckedException("Длина менее 10 символов");
            throw new CheckedException("Длина менее 10 символов");
        }
        this.text = text;
    }
}
