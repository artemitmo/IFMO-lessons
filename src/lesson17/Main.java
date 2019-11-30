package lesson17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {
    //найти студентов с уникальными предметами
    public static void main(String[] args) {
        List<String> listSub = Arrays.asList("34","58","78", "19");

    }
}

class Student{
    private String login;
    private List<String> subjects;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Student(String login, List<String> subjects) {
        this.login = login;
        this.subjects = subjects;
    }
}
