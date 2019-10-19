package Lesson2;

import java.util.Arrays;

public class HomeWork2 {
    /*Дан массив целых чисел. Массив не отсортирован, числа могут повторяться. Необходимо найти в данном массиве такие два числа n m,
 чтобы их сумма была равна 7. Например, 2 + 5 = 7, 6 + 1 = 7, -2 + 9 = 7.
 Наиболее оптимальным способом.

 */
    public void findTwoNum() {

    int[] massiv = {1, 6, 8, -2, -5, 19, 16, 20, 14, 7, 19, 0};
        Arrays.sort(massiv);
        System.out.println(Arrays.toString(massiv));
}
    public static void main(String[] args) {
        HomeWork2 step1 = new HomeWork2();
        step1.findTwoNum();
        System.out.println(step1);
    }

}
