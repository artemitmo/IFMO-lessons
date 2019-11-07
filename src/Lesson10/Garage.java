package Lesson10;
//generic  в наследовании
public class Garage <T extends Bus> { //только автобусы и всего его наследники могут находиться
    private  T bus;

    public Garage(T bus) {
        this.bus = bus;
    }

    public T makeDefault(){
        bus.setDepartureSt("Moscow");
        bus.setDestSt("SPB");
        bus.setNum("3244");
        bus.setWifi(false);
        return bus;
    }
}
