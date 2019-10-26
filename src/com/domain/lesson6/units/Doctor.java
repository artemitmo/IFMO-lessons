package com.domain.lesson6.units;

public class Doctor extends BattleUnit {
    public Doctor(String name, int speed, int health, int attackScore) {
        super(name, speed, health, attackScore);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "attackScore=" + attackScore +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void attack(Unit friend) {
        System.out.println("Доктор подлечил " + friend.getName());
        friend.health += this.attackScore;
    }

    @Override
    public void rest() {
        System.out.println("Пополняет запасы медикаментов");
    }
}
