package com.domain.lesson6.units;

abstract public class Unit implements RestAble{
    protected String name;
    protected int health;
    protected int speed;

    public Unit(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isAlive(){
        return health > 0;
    }

    public void run(){
        System.out.println("Юнит перемещается со скоростью " + speed);
    }
}
