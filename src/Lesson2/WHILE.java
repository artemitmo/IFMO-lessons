package Lesson2;

import java.util.Scanner;

public class WHILE {
    public static void main(String[] args) {
        //повторение цикла - итерация
        //цикл while
        /*while (условие){
            тело цикла;
            break - выйти из цикла
            continue - переходит к следующей итерации
        }*/
        /*int a = 1;
        while (a<=15) {
            a+=3;
            System.out.println("a = " + a);
        }*/

        //Программа загадывает число от 1 до 5;
        /*Пользователь вводит число
        * Программа в зависимости от того, что ввел пользователь выводит следующее
        * загаданное число меньше
        * загаданное число больше
        * Вы угадали
        * 0 - Для выхода из программы */
        System.out.println("Программа загадала число");
        int programNum = (int) (Math.random() * ((5-1) + 1)); //приведение типа (int) Метод генерирует число в милисекундах от 0.01 до 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5 ");

        while (true) {
            int b = sc.nextInt();
            if (b > programNum) {
                System.out.println("Введите число от 1 до 5 ");
                System.out.println("Число больше загаданного ");
                continue;
            } else if (b < programNum) {
                System.out.println("Число меньше загаданного ");
                continue;
            } else if (b == programNum) {
                System.out.println("Вы угадали ");
                break;
            } else if (b > 5){
                System.out.println("Некорретный ввод");
                continue;
            }
        }

        //Цикл do while
        /*do {
            тело цикла
        } while (false) {}; будет выполнена 1 итерация в любом случае
        */

       /* Loopname: while (condition) {
            while (condition2) {
                break Loopname;
            }
        }
        */

        }
    }
