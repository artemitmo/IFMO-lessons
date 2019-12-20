package com.domain.lesson6.units;

public class Doctor extends BattleUnit {
    public Doctor(String name, int speed, int health, int attackScore) {
        super(name, speed, health, attackScore);
    }

    @Override
    public void attack(Unit friend) {
        System.out.println("Доктор увеличил очки здоровья " + friend.getName());
    }

    @Override
    public void rest() {
        System.out.println("Доктор отдыхает");
    }
}
