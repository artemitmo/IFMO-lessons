package com.domain.lesson6.units;
//абстрактный класс для наследования, может иметь методы без реализации, перенятые от интерфейса. От абстракт-класса нельзя создать объект.
abstract public class BattleUnit extends Unit implements AttackAble{
    protected int attackScore;

    public int getAttackScore() {
        return attackScore;
    }

    public void setAttackScore(int attackScore) {
        this.attackScore = attackScore;
    }

    public BattleUnit(String name, int speed, int health, int attackScore) {
        super(name, speed);//предлагает создать конструктор при наследовании. Вызывается конструктор родителя. Super - calls to parent
        this.attackScore = attackScore;
        this.health = health;
    }

    @Override
    public void escapeBattleField() {
        System.out.println("BattleUnit покидает бой");
    }
    //Base-class Unit. BattleUnit extends Unit
    //Наследование, инкапсуляция, полиморфизм, абстракция
    //Населедование extends, расширение функционала родительского класса без его изменения
    //Инкапсуляция - скрытие деталей реализации, модификаторы доступа
    //Абстракция - это интерфейс и абстрактные классы. Методы, которые должны будут потом реализованы, описаны и тд
    //Полиморфизм - работа через общий тип данных, создаем объект...полиморфизм наследования (полиморфного юнита создали)
    //Реализован в перегрузке методов. Когда метод имеет одинаковое название, возвращаемое значение, но разные аргументы.

}
