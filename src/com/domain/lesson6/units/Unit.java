package com.domain.lesson6.units;

abstract public class Unit implements RestAble {
    protected String name; //модификатор protected - доступ внутри класса и в классах-наследниках
    protected int health;  //когда не указано, то доступность внутри пакета
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
        if (this.health>0){
        this.health = health;}
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (this.speed>0){
        this.speed = speed;}
    }

    private boolean isAlive() {
        return health>0;
    }

    public void run(){
        System.out.println("Unit are moving with speed " + speed);
    }
}
