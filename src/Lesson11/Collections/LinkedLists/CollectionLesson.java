package Lesson11.Collections.LinkedLists;

import java.util.*;

public class CollectionLesson {
    public static void main(String[] args) {
        Student student1 = new Student("Иван", "Иванов", 22);
        Student student2 = new Student("Иван", "Иванов", 22);
        Student student3 = new Student("Иван", "Федоров", 18);
        Student student4 = new Student("Алексей", "Михайлов", 25);

        System.out.println("---LinkedList---");
        // быстрая вставка в середину и удаление из середины списка,
        // во всех остальных случаях необходимо выбирать ArrayList
        // порядок элементов гарантирован
        // можно добавить null
        // допускает дублирование элементов

        LinkedList<Student> students = new LinkedList<>();
        students.add(student1);
        students.add(student2);
        //  students.add(7, student3); IndexOutOfBoundsException
        students.add(student2);
//        students.add(null);
        System.out.println(students);
        System.out.println(students.get(0));

        System.out.println("---ArrayList---");
        // порядок элементов гарантирован
        // можно добавить null
        // допускает дублирование элементов
        ArrayList<Student> studentArrayList = new ArrayList<>(20);
        System.out.println(studentArrayList.size());
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(null);
        studentArrayList.trimToSize();
        System.out.println(studentArrayList);
        System.out.println(studentArrayList.subList(0, 2));

        // список из массива
        Student[] studentsArr = {student1, student2, student3};
        studentArrayList.addAll(Arrays.asList(studentsArr));

        System.out.println(studentArrayList.size());

        // SET
        // используется для хранения уникальных элементов
        // обязательно должны быть переопределены методы equals и hashcode

        System.out.println("---HashSet---");
        // порядок элементов может меняться
        // можно хранить null (всегда будет на 1 месте)

        HashSet<Student> studentHashSet = new HashSet<>(studentArrayList);
        System.out.println(studentHashSet.size());
        System.out.println(studentHashSet);


        // LinkedHashSet<Student>
        // порядок элементов гарантирован

        System.out.println("---TreeSet---");
        // нельзя добавить null
        // элементы хранятся в отсортированном порядке


        // ClassCastException
        TreeSet<Student> studentTreeSet =
                new TreeSet<>(Arrays.asList(studentsArr));
        // класс должен implements Comparable
        studentTreeSet.add(student4);
        System.out.println(studentTreeSet);

        // в конструктор TreeSet передать Comparator
        Comparator<Student> studentComparator = new StudentNameComparator()
                .thenComparing(new StudentAgeComparator());

        TreeSet<Student> studentTreeSet2 = new TreeSet<>(studentComparator);
        studentTreeSet2.add(student1);
        studentTreeSet2.add(student1);
        studentTreeSet2.add(student2);
        studentTreeSet2.add(student3);
        studentTreeSet2.add(student4);
        System.out.println(studentTreeSet2);

        // перебор коллекций
        for (Student student: students) {
            System.out.println(student);
            System.out.println(student.getName());
            // students.remove(student); // ConcurrentModificationException
        }
        Iterator<Student> studentIterator = students.listIterator();
        while (studentIterator.hasNext()){
            if (studentIterator.next().getName().equals("Иван")){
                studentIterator.remove();
            }
        }
        System.out.println(students);



    }
}
