package lesson16lambda;

public class Calculator {
    public double calculate (double a, double b, Operation operation){
        return operation.execute(a, b);
    }
    //Калькулятор смотреть в первую очередь
    //Потом функциональные интерфейсы, потом ссылку на конструктор

    public static void main(String[] args) {
        Operation plus  = (a, b) -> a + b;
        Operation div = (a, b) -> {
            if (b==0) throw new IllegalArgumentException ("b не может быть 0");
            return a/b; //когда много, реализация в скобках описываем, ретерн обязательно прописать
        };

        //лямбда выражение, реализация метода execute, ретерн по умолчанию как бы стоит
        //тип данных определяется из контекста
        // () -> если аргументы не передаются, если их несколько, то тоже надо ставить круглые скобки
        // (a,b) ->  - описание действия
        // а -> писание действия
        // (a, b) -> a + b, если не в одну строчку, то фигурные скобки ставим
        //не нужно писать дополнительный код для реализации метода интерфейса

        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(2, 2, plus));
        System.out.println(calculator.calculate(2, 2, div));
    }
}
@FunctionalInterface //аннотация, специально для лямбды
interface Operation {
    double execute (double a, double b); //один абстрактный метод
    //реализацию метода можно сохранить в виде переменной, лямбда-выражение
    //только 1 абстрактный метод, помечается абстрактный интерфейс, его можно вызвать с помощью лямбды
    //у такого интерфейса может быть несколько дефолтных метода
}
