package lesson13;

public class Message {
    private String title;
    private String text;

    public Message(String title, String text) throws Exception { // либо заворачиваем в трай-кетч, либо прописываем
        setTitle(title);
        setText(text);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws Exception { //перебросили исключение в сигнатуру метода, на уровень выше
        if (title == null || title.trim().length() < 3 ){
            //throw new UncheckedException ("Длина менее 3 символов"); //создаем объект на основе своего класса и его выбросили
            throw new CheckedException ("Длина менее 3 символов");
        }
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) throws Exception  {  //перебросили исключение в сигнатуру метода
        if (title == null || title.trim().length() < 10 ){
            //throw new Exception ("Длина менее 10 символов");
            throw new CheckedException ("Длина менее 10 символов");
        }
        this.text = text;
    }
}
