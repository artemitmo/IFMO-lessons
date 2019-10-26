package com.domain.lesson6.units;

public class Warrior extends BattleUnit {
    public Warrior(String name, int speed, int health, int attackScore) {
        super(name, speed, health, attackScore);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "attackScore=" + attackScore +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void attack(Unit enemy) {
        System.out.println("Воин атаковал " + enemy.getName());
        enemy.health -= this.attackScore;
    }


    @Override
    public void rest() {
        System.out.println("Отдыхает");
    }
}
