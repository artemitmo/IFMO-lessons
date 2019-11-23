package Lesson11.Collections.LinkedLists;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int age;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (getAge() != student.getAge()) return false;
        if (getName() != null ? !getName().equals(student.getName()) : student.getName() != null) return false;
        return getSurname() != null ? getSurname().equals(student.getSurname()) : student.getSurname() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
        result = 31 * result + getAge();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.hashCode(), o.hashCode());
    }


//    public static List<Student> create(int count){
//        String[] names = {"qww", "dedf", "ff"};
//        String[] surnames = {"frgt", "tehget", "gtregh"};
//        List<Student> students = new ArrayList<>();
//        for (int i = 0; i < count; i++) {
//            students.add(new Student(
//                    names[random], surnames[random], randomAge
//            ));
//        }
//        return students;
//    }
}

class StudentNameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


class StudentAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}