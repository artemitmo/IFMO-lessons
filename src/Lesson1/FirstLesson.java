package Lesson1;

import java.util.Scanner;

public class FirstLesson {

    //one-string comment ctrl + /
    /*multi-string comment  ctrl + shift + /
     */
    //engage point
    public static void main(String[] args) { //psvm
        //variable dataType + nameVar
        //Ссылочные типы данных

        //Примитивные типы данных (1 байт памяти)
        //от -128 до 127 Используется, когда работаем с потоками данных, передавая файлы по сети
        //используется в массивах для экономии памяти
        byte byteVar = 127;

        //short - 2 bytes
        // -32768 до 32767
        short shortVar = 512;
        short shortVar2 = 1024;
        //short shortVar3 = shortVar + shortVar2; //требует преобразования к int,c byte операции проводить нельзя

        //int - целочисленный тип данных на 4 байта памяти -2 млн до +2 млн
        int intVar = 7;
        int intVar2 = 2;
        int intRes = intVar/intVar2; //отбрасывается остаток дробной части при делении
        int intNew = 1_000_654; //запись, разделенная подчеркиванием для удобства
        //int zeroDivision = intVar/0; // при делении на ноль выбрасывается ошибка

        //long занимает 8 байтов
        long longVar = 3003000000L; //нужно ставить L, когда число выходит за пределы int

        //числа с плавающей точкой
        //для вычислений точность используется специальный класс
        float floatVar = 3.6f; //4 байта
        float zeroDivision2 = floatVar/0; // Infinity
        double doubleVar = 16.98; //предпочтительнее использовать 8 байт
        //double zeroDivision3 = doubleVar/0; // Infinity

        //char - 2 bytes. Хранит символы из таблицы UNICODE в кодировке UTF-16 (от 0 до 65536)
        //boolean - true/false храним состояние объекта, либо используем в условиях (1 бит фактически)
        boolean closed = true;
        boolean isActive = false;

        //привидение типов данных. Переменную одного типа в другую, 1 - автоматическое 2 - вручную (явное)
        byte byteVar5 = 5;
        int intVar6 = byteVar5; //типы должны быть совместимы, контейнер назначения должен быть больше
        long longVar7 = byteVar5; //типы должны быть совместимы, контейнер назначения должен быть больше

        //явное приведение
        int var15 = 45;
        byte var16 = (byte) var15;

        //операторы
        //операторы присваивания
        // =  += -= *= /= %=
        int a = 7;
        a =a + 4; //a+=4;

        //арифмитические операторы
        // + - * / %
        // инкремент и дикремент i++ i--
        //постфиксный сначала
        // декремент (уменьшает на 1)

        int b = 15;

        //операторы сравнения
        // > < >= != ==
        //результат сравнения - булевая переменная true or false

        boolean c = a != b;
        System.out.println(c);

        //Консольный ввод -вывод
        //консольный ввод

        System.out.println("Выводимая информация"); // комбинация sout
        //System.out.printf("Форматированный вывод %\n", "6"); // souf форматированный вывод
        //%f для вывода чисел с плавающей точкой
        //%d для вывода целых чисел
        //%s для вывода строк

        // консольный ввод (хотим получить данные от пользователя)
        //создаем объект класса сканер, импортируем класс сканер
        Scanner scanner = new Scanner(System.in); // alt + Enter => Import Class

        double ac = scanner.nextDouble();
        System.out.printf("Введенное число %f\n", ac);
        System.out.println("Введите число " + (ac + 15));

        //логические операторы - применяются к boolean переменным и выражениям
        //&& И
        // || ИЛИ
        // !! - НЕ
        // ^ - Исключающее или

        //побитовые операторы
        // *& (логическое умножение)
        int k = 2;  // 010
        int j = 4;  // 100
        System.out.printf("результат k & j = %d\n", k & j); //000 -> 0

        k = 4; //100
        j = 5; //101
        System.out.printf("результат k & j = %d\n", k & j); //100 -> 4

        /* | логическое сложение  */
        k = 2; //010
        j = 4; //100
        System.out.printf("результат k | j = %d\n", k | j); //110 (6)

        k = 4; //100
        j = 5; //101
        System.out.printf("результат k | j = %d\n", k | j); //101 (5)

        //побитовое НЕ - инвертирует все биты операнды, унарный оператор !

        //операции сдвига
        /*a<<b  сдвигает число a влево на b разрядов
        * когда вместо b=1 a<<1 эквивалентно умножению на 2 */
        System.out.println("Сдвиг влево 5 <<1 = " + (5<<1) ); //101 на 1 разряд -> 1010 (10)

        /*a>>b  сдвигает число a вправо на b разрядов*/
        // a>>1 эквивалентно делению на 2
        System.out.println("Сдвиг вправо 5 <<1 = " + (4>>1) ); //100 на 1 разряд -> 10 (2)


        //Четность числа n & 1 сли число четное, результат 0, иначе 1
        //Наложение масок (прочитать)


        // тернарный оператор ?
        // Переменная y = (условие) ? выражение 1 : выражение 2;
        int x = 3;
        int y = 2;
        int res = (x > y) ? x - y: x + y;
        int res1 = (x > y && x < y) ? x - y: x + y;
        int res2 = (x > y ^ x < y) ? x - y: x + y;
        int res3 = (x > y || x < y) ? x - y: x + y;

        // конструкции ветвления
        int someCode = 345;
//        if (someCode > 15) {
//            //выполняется код, если true
//            System.out.println("true");
//        } else {// выполняется если условие ложно
//            System.out.println("false");*/
//        } else if (true) {
//            System.out.println("Always true");
//        }
        System.out.println("Input the value");

        //Конструкция свитч
        switch (scanner.nextInt()){
            case 1 ->
                System.out.println("Var1");
                //выполняется либо до первого брейка, либо до конца конструкции
            case 2 -> System.out.println("Var2");
            case 3, 4 -> System.out.println("Var3 and 4");
            default -> //выполняется по умолчанию
                System.out.println("Не определен"); // брейк можно не ставить
        }

        /*switch (scanner.nextInt()){
            case 1, 15, 20 -> System.out.println("User code");
            default:
        }
        Посмотреть в 13й версии, в лесон 1 */


        int s = 50;
        int z = 20;
        int w = 70;

        if (s > z & s > w){ //boolean expression
            System.out.println("Наибольшее число " + s );
        }
        else if (z > s & z >w) {
            System.out.println("Наибольшее число " + z );
        }
        else {
            System.out.println("Наибольшее число " + w );
        }
    }
}

// Даны 3 числа, Целые и неравны между собой. Вывести в консоль наибольшее из них. Лекции на github.com/ifmo-java будут репозитории с лекциями repo
