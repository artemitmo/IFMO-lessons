package com.domain.lesson6.units;

// BattleUnit bu = new BattleUnit("юнит", 6);

abstract public class BattleUnit extends Unit implements AttackAble{

    protected int attackScore;

    public BattleUnit(String name, int speed, int health, int attackScore) {
        super(name, speed); // вызов конструктора родителя
        this.health = health;
        this.attackScore = attackScore;
    }

    public int getAttackScore() {
        return attackScore;
    }

    public void setAttackScore(int attackScore) {
        this.attackScore = attackScore;
    }



    @Override
    public String toString() {
        return "BattleUnit{" +
                "attackScore=" + attackScore +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void escapeBattleField() {
        System.out.println("Юнит " + this.name + " сбежал с поля боя");
    }
}
