package Lesson8clone.finaloperator;

import java.time.LocalDateTime;

public final class Message { //нельзя наследоваться при final (для класса) Класс стринг всегда final
    private String from;
    private String to;
    private String text;
    private LocalDateTime dateSend; //объект для работы с датой и временем (c 8 версии)

    public Message(String from, String to, String text) {
        this.from = from;
        this.to = to;
        this.text = text;
        dateSend =  LocalDateTime.now();
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getDateSend() {
        return dateSend;
    }

    /*class  VoiceMessage extends Message{
        дочерних классов быть не может
    }*/
}
