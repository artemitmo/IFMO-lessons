package com.domain.lesson6.units;

public class Knight extends BattleUnit {
    public Knight(String name, int speed, int health, int attackScore) {
        super(name, speed, health, attackScore);
    }

    @Override
    public String toString() {
        return "Knight{" +
                "attackScore=" + attackScore +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void attack(Unit enemy) {
        System.out.println("Рыцарь атаковал " + enemy.getName());
        enemy.health -= this.attackScore;
    }

    @Override
    public void rest() {
        System.out.println("Флиртует с дамами");
    }
}
