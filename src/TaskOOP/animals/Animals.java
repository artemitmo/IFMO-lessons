package TaskOOP.animals;

abstract public class Animals {
    private String name;
    private int weight;
    private int speed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Animals(String name, int weight, int speed) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }


    }
