package HomeWork;

import java.util.Arrays;

public class ArrSearch {
    public static void main ( String[] args ) {
        System.out.println("Индексы двух элементов массива arr[], в сумме дающие 7");
        int arr[] = {15 , 8 , 9 , 0 , 6 , 9 , 18 , -1 , 7 , 2 , 5 , 4};
        int arrSort[] = arr.clone();
        //Arrays.sort(arrSort); // [-1, 0, 2, 4, 5, 5, 6, 7, 9, 9, 15, 18]
        for (int i = 0; i < arr.length; i++) {
            for (int j = arrSort.length-1; j > 0; j--) {
                int c = arr[i] + arrSort[j];
                if (c == 7) {
                    System.out.println( i + " и " + j );
                    break;
                }
            }
        }
    }
}