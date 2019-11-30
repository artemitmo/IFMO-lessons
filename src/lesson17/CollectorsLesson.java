package lesson17;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsLesson {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("qwe", "bcc", 1000, 28));//создаем объект внутри
        employees.add(new Employee("jgh", "bmg", 7000, 38));
        employees.add(new Employee("qad", "bed", 3000, 49));
        employees.add(new Employee("qrt", "bed", 7000, 19));
        employees.add(new Employee("qbc", "bof", 1000, 22));
        //группировка по компании
        employees.stream().collect(Collectors.groupingBy(Employee::getCompany)).entrySet().forEach(System.out::println);
        //хорошие методы в классе Коллекторс
        //employee -> employee.getCompany() группировка по компании
        employees.stream().map(Employee::getCompany).distinct().sorted().forEach(System.out::println); //запускаем стрим, мапу делаем,выкидываем одинаковые, сорт
        //partitioningBy grouping

        System.out.println();

        employees.stream().collect(Collectors.groupingBy(Employee::getCompany, Collectors.counting())) //counting собирает сколько сотрудников работает
        // в каждой компании, мапа будет уже стринг и лонг
        .entrySet().forEach(System.out::println); //сколько сотрудников работает в организации
        /*bed=2
          bcc=1
          bof=1
          bmg=1*/

        //Map <Integer, ArrayList> по зп
        Map<Integer, ArrayList<Employee>> salaryMap =
        employees.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.toCollection(ArrayList::new)));

        //по средней зп
        Map<String, Double> compAverageSalary = employees.stream().collect(Collectors.groupingBy(Employee::getCompany, Collectors.averagingDouble(Employee::getSalary)));

        Map<String, Map<Integer, List<Employee>>> companyAndSalary = employees.stream().
                collect(Collectors.groupingBy(Employee::getCompany, Collectors.groupingBy(Employee::getSalary)));
    //группибай возвращает мапу по умолчанию
    }
}
