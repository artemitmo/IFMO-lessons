package com.domain.lesson6.units;

public interface RestAble {
    void rest();

    default void escapeBattleField(){
        System.out.println("Юнит сбежал с поля боя");
    }

}
