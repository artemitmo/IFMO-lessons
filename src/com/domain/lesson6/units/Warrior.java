package com.domain.lesson6.units;

public class Warrior extends BattleUnit {
    public Warrior(String name, int speed, int health, int attackScore) {
        super(name, speed, health, attackScore);
    }


    @Override
    public void attack(Unit enemy) {
        System.out.println("Воин атаковал " + enemy.getName());
    }

    @Override
    public void rest() {
        System.out.println("Воин отдыхает");
    }

    @Override
    public void run(){
        super.run(); // вызов метода родителя
        System.out.println("Расширение функционала");
    }
}
