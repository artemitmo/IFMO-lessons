package lesson17.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExamplesW {
    public static void main(String[] args) {
      long count = IntStream.of(15, 26, 19, 17, 0, -2, -8).filter(value -> value<0).count();
        System.out.println(count);
        System.out.println();

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Milan");
        Collections.addAll(cities, "London", "Rome", "Moscow"); //Здесь addAll - сначала записали куда добавляем, а потом, что добавляем
        cities.stream().filter(m -> m.length() >= 5).forEach(m -> System.out.println(m));//по цепочке создали поток из эрейлиста, фильтр по длине больше =5 и вывод на экран
        System.out.println();
/*ArrayList<String> cities = new ArrayList<String>();
Collections.addAll(cities, "Париж", "Лондон", "Мадрид");
Stream<String> citiesStream = cities.stream(); // получаем поток
citiesStream = citiesStream.filter(s->s.length()==6); // применяем фильтрацию по длине строки
citiesStream.forEach(s->System.out.println(s)); // выводим отфильтрованные строки на консоль*/
        Stream<String> citiesStream = Arrays.stream(new String[]{"Париж", "Лондон", "Мадрид"}) ;
        citiesStream.forEach(s->System.out.println(s)); // выводим все элементы массива


    }
}
