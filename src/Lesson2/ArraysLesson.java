package Lesson2;
import java.util.Arrays;

//В массиве хранятся данные одного типа
//индекс - позиция элемента в массиве
public class ArraysLesson {
    public static void main(String[] args) {
        int[] arr; //более предпочтительный вариант, а так the same
        int arr1[];

        //array with 5 elements
        arr = new int[5];
        System.out.println(Arrays.toString(arr));
        //размер массива изменять нельзя
        System.out.println("Arrays size is " + arr.length);

        //наполним массив значениями
        int[] arr2 = {5, 16, 26, 73, -12};
        //доступ к элементам массива
        System.out.println(arr2[3]); //73
        System.out.println(arr2[2 + 1]); //73
        //System.out.println(arr2[14]);  IndexOutOfBoundsException

        arr2[2] = 15; //changes value
        for (int i = 0; i <arr2.length ; i++) {
            arr2[i]+=1;
        }

        //копирование массива
        int[] arr3 = {23, 78, 12};
        int[] arr4 = arr3; //ссылка на тот же самый массив, но не копирование, касается в целом объектов
        int[] cloneArr = arr3.clone(); //метод clone есть у всех объектов, тогда это новый массив
        System.out.println(cloneArr.toString());
        System.out.println(Arrays.toString(cloneArr));
        System.out.println(arr3.toString());
        System.out.println(arr4.toString());


        int[] arr5 = new int[15];
        System.arraycopy(arr3, 1, arr5, 3, 2); //с какого массива копируем, с какого элемента, в какой массив, с какого элемента, сколько элементов
        System.out.println(Arrays.toString(arr5));

        int[] copyArr = Arrays.copyOf(arr3, 5); //из какого массива копируем и вводим длину нового массива
        System.out.println(Arrays.toString(copyArr));

        arr3 = new int[] {15, 26, 18, 96, 16};

        //перебор массива
        for (int i = 0; i <arr3.length ; i++) {
            arr3[i] *=2;
            System.out.println(arr3[i]);
        }
        System.out.println(Arrays.toString(arr3));

        //не меняется массив, переменная elem выводится
        for (int elem: arr3
             ) {
            elem*= 2;
            System.out.println(elem);
        }

        //сравнение массивов
        arr3 = new int[] {2, 67, 18};
        arr4 = new int[] {2, 67, 18};
        System.out.println(Arrays.equals(arr3, arr4)); //сравниваем через метод класса Arrays, посмотреть с флотом и сравнивание многомерных массивов
        // создать программу сравнения двумерных массивов

        //сортировка массивов по возрастанию
        arr4 = new int[] {12, 64, 73, 84, 92};
        Arrays.sort(arr3); //сортирует либо объект целиком, либо часть массива (arr3, 3, 5) индексы от и дож
        // быстрая сортировка, сложность - O (n log n)
        //выбирается опорный элемент, массив делится на 2 части, сравнивается больше и меньше, затем еще раз делится на 2, до тех пор пока нечего будет делить
        //алгоритмы сортировки почитать, какие работают быстрее, какие медленнеее на Java - вручную, например
        //сортировка пузырьком и тд.
        /*
         0 (1) - константное время. Алгоритм будет выполняться за определенное время, 100 страниц в книге, но за час читает человек 50 и все
         0 (log n ) - логарифмическая сложность. С увеличением элементов - время выполнения уменьшается.
         считаются высокоэффективными

         O (n) - линейная сложность , время возрастает с увеличением входящих данных
         О (n log n) - квазилогарифмическая сложность
         расположить в порядке возрастания=)
         */

        //бинарный поиск
        arr3 = new int[]{ 2, 7, 8, 16, 82};
        System.out.println(Arrays.binarySearch(arr3, 7)); // ищет элемент в массиве, возвращает либо индекс, либо позицию +1 со знаком минус
        System.out.println(Arrays.binarySearch(arr3, 6)); // ищет элемент в массиве, возвращает либо индекс, либо позицию +1 со знаком минус, если не находит

    }
}
