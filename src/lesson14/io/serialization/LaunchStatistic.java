package lesson14.io.serialization;

import java.io.Serializable;
import java.time.LocalDateTime;

public class LaunchStatistic  {
    private int launchCount;
    private LocalDateTime lastLaunch;
    private String user;
    // свойства, отмеченные как transient не участвуют в сериализации
    transient private String name = "LaunchStatistic";
    // уникальный идентификатор версии сериализованного класса,
    // записывается в поток при сериализации
    // При десериализации значение этого поля сравнивается
    // с имеющимся у локального класса
    private static final long serialVersionUID = 1L;

    public boolean isFirstLaunch(){
        return launchCount == 0 && lastLaunch == null;
    }

    public void update(){
        launchCount++;
        lastLaunch = LocalDateTime.now();
        user = System.getProperty("user.name");
    }

    @Override
    public String toString() {
        return "LaunchStatistic{" +
                "launchCount=" + launchCount +
                ", lastLaunch=" + lastLaunch +
                ", user='" + user + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

class Parent{
    String name;
}

class Child extends Parent implements Serializable {
    int age;
}

