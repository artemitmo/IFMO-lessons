package lesson17;

import java.util.EnumSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;
//Создаем свой Коллектор, переопределяем методы интерфейса Коллектор

public class MyCollector implements Collector<String, TreeSet<String>, String> {
    //лямбда, определяющая создание контейнера для хранения промежуточных результатов

    @Override
    public Supplier<TreeSet<String>> supplier() {
        return TreeSet::new;//лямбда, определяющая создание контейнера для хранения промежуточных результатов
    }

    @Override
    public BiConsumer<TreeSet<String>, String> accumulator() {//(обработка) + добавление промежуточного результата
        return TreeSet::add;
    }

    @Override
    public BinaryOperator<TreeSet<String>> combiner() {//объединение нескольких контейнеров, если стрим будет
        //параллельным
        return (treeset, strings) -> {//описываем как в один собирается
            treeset.addAll(strings);
            return treeset;
        };
    }

    @Override //прописываем основной функционал по обработке элементов
    public Function<TreeSet<String>, String> finisher() {//финальное преобразование элементов контейнера
        return strings -> strings.stream()
                        .skip(1).sorted()
                         .findFirst()
                         .orElse("default");
        //почему вернулось ф, пропустили первое значение
    }

    @Override
    public Set<Characteristics> characteristics() {
        return EnumSet.of(Characteristics.CONCURRENT);
    }

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("f","e","z","x");
        System.out.println(stringStream.collect(new MyCollector()));
    }
}
