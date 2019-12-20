package lesson2;

import java.util.Arrays;

public class ArraysLesson {
    public static void main(String[] args) {
        // объявление переменной массива
        int[] arr;
        int arr1[];

        // массив со значениями по-умолчанию из 5 элементов
        arr = new int[5];
        System.out.println(Arrays.toString(arr));

        // размер массива изменить нельзя
        System.out.println("Размер массива: " + arr.length);

        // наполнение массива значениями при инициализации
        int[] arr2 = {5, 67, 12, -12, 0, 1};

        // доступ к элементам массива
        System.out.println(arr2[3]); // -12
        System.out.println(arr2[1+2]); // -12
//        System.out.println(arr2[15]); //ArrayIndexOutOfBoundsException

        arr2[1] = 853;
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] += 1;
        }

        // копирование массива
        int[] arr3 = {23, 78, 12};
        int[] arr4 = arr3;

        int[] cloneArr = arr3.clone();
        System.out.println(Arrays.toString(cloneArr));


        int[] arr5 = new int[15];
        System.arraycopy(arr3, 1, arr5, 3, 1);
        System.out.println(Arrays.toString(arr5));

        int[] copyArr = Arrays.copyOf(arr3, 6);
        System.out.println(Arrays.toString(copyArr));

//        int[] arr3 = {4, 78, 12};
        arr3 = new int[]{2, 67, 123, 90, 1};

        // перебор массива
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] *= 2;
        }
        System.out.println(Arrays.toString(arr3));

        for (int elem: arr3){
            elem *= 2;
            System.out.println(elem);
        }
        System.out.println(Arrays.toString(arr3));

        // сравнение массивов
        arr3 = new int[]{2, 67, 123};
        arr4 = new int[]{2, 67, 123};

        System.out.println(Arrays.equals(arr3, arr4));

        // сортировка массивов
        arr4 = new int[]{2, 67, 123, -304, 0, 13};
        Arrays.sort(arr4); // Arrays.sort(arr4, 1, 5);
        // быстрая сортировка, сложность - О(n log n) // TODO: ПОСМОТРЕТЬ РЕАЛИЗАЦИЮ АЛГОРИТМА

        // бинарный поиск, сложность O(log n) // TODO: ПОСМОТРЕТЬ РЕАЛИЗАЦИЮ АЛГОРИТМА
        arr4 = new int[]{3, 5, 6, 7, 10, 34};
        System.out.println(Arrays.binarySearch(arr4, 6));
        System.out.println(Arrays.binarySearch(arr4, 23));



        /*
        * O(1) - константное время
        * O(log n) - логарифмическая сложность
        * считаются высокоэффективными
        * O(n) - линейная сложность
        * O(n log n) - квазилогарифмическая сложность
        * */



        // 1. Написать программу перевода числа из 10 системы счисления
        // в 2 систему счисления

        // 2. Написать программу перевода числа из 10 системы счисления
        // в 16 систему счисления

        /*Дан массив целых чисел.
        Массив не отсортирован, числа могут повторяться.
        Необходимо найти в данном массиве такие два числа n и m,
        чтобы их сумма была равна 7.
        Например, 2 + 5 = 7, 6 + 1 = 7, -2 + 9 = 7
        * */




    }
}
