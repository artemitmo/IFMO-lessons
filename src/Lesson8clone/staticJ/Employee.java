package Lesson8clone.staticJ;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Employee {
    static String company;// статическое поле, все принадлежит к классу, можно вызывать по имени класса
    static{
        int p = 12;
        company = "HEV";
    }//статический блок служит для инициализации статических свойств,
    // загружается в память 1 раз и хранится в памяти

    static void changeCompany(String newCompany){ //тоже принадлежит классу, присваиваем статической переменной
        company = newCompany;
    }
    void printCompany(){
        System.out.println(company);
    }

    private String name;
    private String position;
    private LocalDateTime timeStart;
    private LocalDateTime timeEnd;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void setTimeStart(LocalDateTime timeStart) {
        this.timeStart = timeStart;
    }

    public void setTimeEnd(LocalDateTime timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getTimeStart() {
        return timeStart.format(DateTimeFormatter.ofPattern("d MMMM uuuu в"));
    }

    public String getTimeEnd() {
        return timeEnd.format(DateTimeFormatter.ofPattern("d MMMM uuuu в"));
    }
    public void printCurrentDayStatistic(){
        System.out.println(this.position + " " + this.name + " пришел " + getTimeStart() + " ушел " + getTimeEnd());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", timeStart=" + timeStart +
                ", timeEnd=" + timeEnd +
                '}';
    }
}
