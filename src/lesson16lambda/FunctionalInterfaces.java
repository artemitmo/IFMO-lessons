package lesson16lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        //встроенные функциональные интерфейсы:
        //интерфейс Predicate<T>
        //boolean test (T t); принимает на вход 1 аргумент, возвращает true or false
        //default: - дефолт-методы
        //boolean or (Predicate p)
        //boolean and (Predicate p)
        //boolean negative (Predicate p)
        Predicate<Integer> pos = (num) -> num >0;
        Predicate<Integer> neg = (num) -> num <0;
        Predicate<Integer> isEven = (num) ->num%2==0;

        System.out.println(pos.test(23)); //true
        System.out.println(neg.test(234));//false
        System.out.println(pos.and(isEven).test(45));//false берет и для того и для другого
        System.out.println(pos.or(isEven).test(22));//true или там тру или там

        //Интерфейс Function<T, R> первый тип принимается в метод, второй - возвращается методом
        //R apply (T t);
        // default:
        //andThen (Function after)
        //compose (Function before)

        Function<Integer, Double> tenPercent = num -> num*0.1; //создается автоматически переменная, если лямба
        Function<Integer, Integer> plusTen = num -> num + 10;
        Function<Integer, Integer> plusFive = num -> num+5;

        System.out.println(plusTen.andThen(plusFive).andThen(tenPercent).apply(16)); //сначала передается 16, потом по порядку вычисляется

        Function <Integer, Integer> addTwo = num -> num*2;
        Function <Integer, Integer> sqrt = num -> num*num;

        addTwo.andThen(sqrt).apply(3);
        addTwo.compose(sqrt).andThen(sqrt).compose(sqrt).apply(3); //возведение в квадрат сработает быстрее
        System.out.println(addTwo.compose(sqrt).andThen(sqrt).compose(sqrt).apply(3)); //compose считается первым, потом по порядку

        //Функция принимает на вход число и возвращает с $ (4 -> "4$")
        Function<Integer, String> convert = num -> num + " $";

        //дан Predicate condition и две Function ifTrue and ifElse.
        //Написать метод, который вернет новую функцию (Function), возвращающую значение функции ifTrue,
        //если condition == true и наоборот.
        Predicate<Integer> cond = num -> num > 0;
        Function<Integer, Integer> func = getFunction(cond, plusFive, plusTen);
        System.out.println(func.apply(15));

        //BinaryOperator<T>
        //T apply (T t1, T t2) - дабл принимает - дабл возвращает, принимает 2 аргумента, производит бинарную операцию и возвращает
        //тот же тип данных. Бинарный - операции с двумя операндами

        //UnaryOperator<T>
        //T apply (T t); -то же самое, что и бинарный, но принимает 1 объект и возвращает 1
        //Унарный с 1 операндом

        //Consumer<T>
        //void accept (T t) - ничего не возвращает, принимает объект, производит с ним действия и все

        //

}

    public static Function<Integer, Integer> getFunction (Predicate <Integer> condition, Function <Integer, Integer> ifTrue, Function<Integer, Integer> ifFalse){
        return  num -> condition.test(num) ? ifTrue.apply(num) : ifFalse.apply(num);
    }
}
