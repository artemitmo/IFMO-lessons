package HomeWork.firstPush;

//написать программу перевода числа из 10 системы исчисления в двоичную, шестнадцатиричную, реализовать на языке программирования
//можно разделить на 2 метода

/*Дан массив целых чисел. Массив не отсортирован, числа могут повторяться. Необходимо найти в данном массиве такие два числа n m,
 чтобы их сумма была равна 7. Например, 2 + 5 = 7, 6 + 1 = 7, -2 + 9 = 7.
 Наиболее оптимальным способом.

 */

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {

    public static void binary (){
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число для перевода в двоичную систему ");
        int a = scn.nextInt();
        int b;
        String value = "";
        while(a !=0){
            b = a%2;
            value = b + value;
            a = a/2;
        }
        System.out.print(value);
    }



    public static void hexadecimal (){
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число для перевода в шестнадцатеричную систему ");
        int a = scn.nextInt();
        int b;
        String value = "";
        while(a !=0){
            b = a%16;
            value = b + " " + value;
            a = a/16;
        }
        String [] str = value.split(" ");         //создаю новый массив, путем разделения строки стринг, в скобках - ориентир разделения
        String [] str1 = {"10","11","12","13","14","15"}; //второй массив с числами, которые необходимо заменить на буквы 16-ной системы
        for (int i = 0; i <str.length ; i++) {            //пробегаюсь по массиву, для изменения через for значений
            if (str[i].equals(str1[0])){
                str[i] = "A";
                System.out.print(str[i]);}
            else if (str[i].equals(str1[1])){
                str[i] = "B";
                System.out.print(str[i]);}
            else if (str[i].equals(str1[2])){
                str[i] = "C";
                System.out.print(str[i]);}
            else if (str[i].equals(str1[3]))
            { str[i] = "D";
                System.out.print(str[i]);}
            else if (str[i].equals(str1[4]))
            { str[i] = "E";
                System.out.print(str[i]);}
            else if (str[i].equals(str1[5]))
            { str[i] = "F";
                System.out.print(str[i]);}
            else {
                System.out.print(str[i]);
            }
        }
    }



    public static void main(String[] args) {
        binary ();
        System.out.println();
        hexadecimal();
    }
}