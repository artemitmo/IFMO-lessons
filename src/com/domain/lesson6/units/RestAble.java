package com.domain.lesson6.units;

public interface RestAble {
    void rest();

    default void escapeBattleField(){  //2 метода в каждом интерфейсе
        System.out.println("Юнит сбежал с поля боя ");
        //если мы для батлюнита вызовем дефолт метод, то программа не поймет какого интерфейса вызвать метод
        //при расширении нескольких интерфейсов с одинаковыми интерфейсами возникает конфлик,
        // идем в класс, которому достаются 2 метода и необходимо переопределить
    }
}
