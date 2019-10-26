package com.domain.lesson6.units;

public class King extends Unit {
    public King(String name, int speed, int health) {
        super(name, speed);
        this.health = health;
    }

    @Override
    public String toString() {
        return "King{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void rest() {}
}
