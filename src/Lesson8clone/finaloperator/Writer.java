package Lesson8clone.finaloperator;

public class Writer {
    public final String ip; //нельзя изменить значения инициализированных единожды файнал-свойств

    public Writer (String ip) { // можно 1 раз присвоить значения для final
        this.ip = ip;
    }

    //final  с инициализацией доступен только для чтения, константа

    public final void sendMessage(final Message message){//тип данных и название временной переменной , может принимать сколько угодно объектов"..."
        System.out.println("Отправка сообщения... " + "from: " + message.getFrom()
                + "to " + message.getTo() + " " + message.getDateSend()); //берем
    }
}
