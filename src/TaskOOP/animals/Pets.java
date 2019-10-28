package TaskOOP.animals;

public class Pets extends Animals {
    private String name;
    private int weight;
    private int speed;
    private int health;
    private int oneDayPut;

    public Pets(String name, int weight, int speed, int health, int oneDayPut) {
        super(name, weight, speed);
        this.health = health;
        this.oneDayPut = oneDayPut;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getOneDayPut() {
        return oneDayPut;
    }

    public void setOneDayPut(int oneDayPut) {
        this.oneDayPut = oneDayPut;
    }

    public Pets(String name, int weight, int speed, int health) {
        super(name, weight, speed);
        this.health = health;
    }


}
