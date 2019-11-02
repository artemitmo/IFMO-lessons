package Lesson8clone.staticJ;

import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Tom", "дворник");
        Employee employee2 = new Employee("Mike", "охранник");
        employee.setTimeStart(LocalDateTime.of(2019, Month.OCTOBER, 25, 6, 0));
        employee2.setTimeStart(LocalDateTime.of(2019, Month.OCTOBER, 25, 5, 0));
        employee.setTimeEnd(LocalDateTime.of(2019, Month.OCTOBER, 25, 14, 0));
        employee2.setTimeEnd(LocalDateTime.of(2019, Month.OCTOBER, 25, 19, 0));

        employee.printCurrentDayStatistic();
        employee2.printCurrentDayStatistic();
        System.out.println(Employee.company);
        Employee.changeCompany("EPAM");
        employee.printCompany();
        employee2.printCompany();


    }
}
