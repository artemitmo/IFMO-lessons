package lesson16lambda.training;

public class test2 {
    public static void main(String[] args) {
        Calc Summa;
        Summa = (a, b) -> a+b; //прописываем компактное переопределение метода от интерфейса
        System.out.println(Summa.sum(15, 26));
    }
}

interface Calc{
    int sum(int a, int b); //прописываем что возвращать должен метод интерфейса и какие значение брать на прием
}
/*Параметры лямбда-выражения должны соответствовать по тип параметрам метода из функционального интерфейса.
 При написании самого лямбда-выражения тип параметров писать необязательно, хотя в принципе это можно сделать, например: 1
 operation = (int x, int y)->x+y;
 Если метод не принимает никаких параметров, то пишутся пустые скобки, например:
()-> 30 + 20;
Если метод принимает только один параметр, то скобки можно опустить:
n-> n * n;*/

/*public class LambdaApp {

    public static void main(String[] args) {

        Operationable<Integer> operation1 = (x, y)-> x + y;
        Operationable<String> operation2 = (x, y) -> x + y;

        System.out.println(operation1.calculate(20, 10)); //30
        System.out.println(operation2.calculate("20", "10")); //2010
    }
}
interface Operationable<T>{
    T calculate(T x, T y); - метод такого плана
}*/