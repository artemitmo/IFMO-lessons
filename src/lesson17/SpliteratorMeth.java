package lesson17;


import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorMeth {
    public static void main(String[] args) {
        List<String> stringArrayList = Arrays.asList("a", "b", "c", "d", "e");
        System.out.println(stringArrayList.spliterator().hasCharacteristics(Spliterator.CONCURRENT));
        System.out.println(stringArrayList.spliterator().hasCharacteristics(Spliterator.SORTED));
        System.out.println(stringArrayList.spliterator().hasCharacteristics(Spliterator.NONNULL));
        System.out.println(stringArrayList.spliterator().hasCharacteristics(Spliterator.DISTINCT));
        System.out.println(stringArrayList.spliterator().hasCharacteristics(Spliterator.ORDERED));
        System.out.println(stringArrayList.spliterator().hasCharacteristics(Spliterator.SUBSIZED));
        //определяет исходя из знаний данных
        Spliterator<String> stringSpliterator = stringArrayList.spliterator();
        System.out.println(stringSpliterator.estimateSize());
        System.out.println(stringSpliterator.getExactSizeIfKnown()); //вернется то же самое
        stringSpliterator.trySplit(); //тот же самый Итератор, только с другим набором методов
        System.out.println(stringSpliterator.estimateSize());//порядок и тд
        System.out.println(stringSpliterator.getExactSizeIfKnown());//у сплитератора можно получить метку где находится

        Spliterator<String> spliterator2 = stringArrayList.spliterator();
        Spliterator<String> spliterator3 = spliterator2.trySplit(); //трайсплит инициализирует многопоточность
        spliterator2.forEachRemaining(System.out::println);//появился в 8й версии ПОЧИТАТЬ ДОМА!!!!!!!!!
        System.out.println("==");
        spliterator3.forEachRemaining(System.out::println);
        //stringArrayList.spliterator().getComparator(); можем вызвать методы компаратора
    }
}
