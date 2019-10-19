package HomeWork;

import java.util.Scanner;

public class NOD {
    public static void main(String[] args) {
        System.out.println("Введите первое число для нахождения наибольшего общего делителя: ");
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        System.out.println("Введите второе число для нахождения наибольшего общего делителя: ");
        int b = scr.nextInt();

        /*while (b !=0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        System.out.println("Ответ " + a);*/

        for (int i = 1; ; i++) {
            if (a > b) {
                if (a % b == 0) {
                    System.out.println("НОД = " + b);
                    break;
                }
                else if (a % b != 0) {
                    a = a % b;
                }
            }
            else {
                if (b % a == 0) {
                    System.out.println("НОД = " + a);
                    break;
                }
                else {
                    b = b % a;
                }
            }
        }
    }
}
