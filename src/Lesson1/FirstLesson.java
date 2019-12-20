package lesson1;

import java.util.Scanner;

public class FirstLesson {
    //    однострочный комментарий ctrl + /
   /*многострочный  ctrl + shift + /
       комменнтарий*/

    //точка входа в программу
    public static void main(String[] args) { // psvm
//        Объявление переменных
        // типДанных имяПеременной;

//        Ссылочные типы данных
//        Примитивные типы данных

//        byte - 1 байт
//        от -128 до 127
//        Используется при работе с потоками данных,
//            в массивах для экономии памяти

        // Объявление переменной типа byte
        byte byteVar = 23;

        // short - 2 байта
        // от -32768 до 32767
        // Объявление переменной типа short
        short shortVar = 12;
        short shortVar1 = 19;
        // short shortRes = shortVar + shortVar1;
//        ошибка, тк в арифметических операциях вычисления выполняются,
//                как с типом int

        // int - 4 байта
        int intVar = 7;
        int intVar1 = 2;
        // при делении дробная часть отбрасывается
        int intRes = intVar / intVar1;
        // для удобства доступна запись
        int intVar2 = 1_000_000;
        //int zeroDivision = intVar / 0; //ArithmeticException: / by zero

        // long - 8 байт
//        long longVar = 3000000000; будет восприниматься как int,
        // поэтому используем запись вида
        long longVar = 3000000000L;


        // числа с плавающей точкой
//        float - 4 байта
        float floatVar = 3.6f;
        float zeroDivisionFloat = floatVar / 0; // Infinity

        //double - 8 байт
        double doubleVar = 5.7;
        double zeroDivisionDouble = doubleVar / 0; // Infinity

        // char - 2 байта
//        хранит номер символа в таблице Unicode в кодировке UTF-16
//        от 0 до 65536

        // boolean
        // true / false

        boolean closed = true;
        boolean isActive = false;

        // приведение типов
        // 1. автоматическое преобразование
        byte byteVar3 = 3;
        int intVar3 = byteVar3;

        // 2. явное приведение типов
        intVar3 = 45;
        byteVar3 = (byte) intVar3;


        // операторы
        // операторы присваивания
        // = | += | -= | *= | /= | %=
        int a = 7;
        a = a + 4; // a += 4;

        // арифметические операторы
        // + | - | * | / |%
        // 7 % 2; // 1

        // инкремент (увеличивает на 1)
        // i++ ++i
        // декремент (уменьшает на 1)
        // i-- --i

        // операторы сравнения (результат работы либо true, либо false)
        // > | < | >= | <= | != | ==

        // Консольный ввод-вывод
        // Консольный вывод

        System.out.println("Выводимая информация"); // sout

        System.out.printf("Форматированный вывод %s\n", "данных"); // souf
        // %f для вывода чисел с плавающей точкой
        // %d для вывода целых чисел
        // %s для вывода строк

        // консольный ввод
        Scanner in = new Scanner(System.in); // alt + Enter -> Import Class
        System.out.println("Введите число");
        int num = in.nextInt();
        System.out.printf("Вы ввели: %d\n", num);


        //  Логические операторы - применяются к boolean переменным и выражениям
        // && И
        // || ИЛИ
        // ! - НЕ
        // ^ - Исключающее или


        /*Побитовые операторы*/
        /*& (логическое умножение)*/
        int k = 2; // 010
        int j = 4; // 100
        System.out.printf("Результат k & j = %d\n", k & j); //000 -> 0

        k = 4; // 100
        j = 5; // 101
        System.out.printf("Результат k & j = %d\n", k & j); // 100 -> 4

        /* | логическое сложение*/
        k = 2; // 010
        j = 4; // 100
        System.out.printf("Результат k | j = %d\n", k | j); // 110 -> 6

        k = 4; // 100
        j = 5; // 101
        System.out.printf("Результат k | j = %d\n", k | j); // 101 -> 5

        /*Побитовое НЕ ~ унарный оператор, инвертирует биты операнда*/

        /* Операции сдвига */
        /* a<<b сдвигает число a влево на b разрядов*/
        /* a<<1 эквивалентно умножению на 2*/
        System.out.printf("Сдвиг влево 5 << 1 = %d\n", 5<<1);
        // 101 на 1 разряд -> 1010 -> 10

        /* a>>b сдвигает число a вправо на b разрядов*/
        /* a>>1 эквивалентно делению на 2*/
        System.out.printf("Сдвиг вправо 4 >> 1 = %d\n", 4>>1);
        // 100 на 1 разряд -> 10 -> 2

        /*Четность числа n & 1 если число четное, результат 0,
        * в противном случае 1*/

        // тернарный оператор
        // Переменная y = (условие) ? выражение1 : выражение2;

        int x = 3;
        int y = 2;

        int res = x > y ? x - y : x + y;

        //конструкции ветвления

       /*if (условие) {
           // код выполняется, если условие true
       } else {
           // код выполняется, если условие false
       }

       if (условие) {
           // код выполняется, если условие true
       } else if (условие2) {
           // код выполняется, если условие - false и условие2 true
       }*/

        System.out.println("Введите число");

        switch (in.nextInt()){
            case 1:
                System.out.println("Вариант 1");
                break;
            case 2:
                System.out.println("Вариант 2");
                break;
            case 3:
            case 4:
                System.out.println("Вариант 3, 4");
                break;
            default:
                System.out.println("Вариант не определен");
                break;

        }

        /*SWITCH IN Java 12 + 13 */

/*        int code = 3;
        switch (code) {
            case 1  -> System.out.println("user code");
            case 2  -> System.out.println("admin code");
            default -> System.out.println("code is not valid");
        }

        switch (code) {
            case 1, 15, 67 -> System.out.println("user code");
            case 2  -> System.out.println("admin code");
            default -> System.out.println("code is not valid");
        }

        code = 2;
        System.out.println(
                switch (code) {
                    case  1 -> "user code";
                    case  2 -> "admin code";
                    default -> "code is not valid";
                }
        );


        code = 1;
        String codeRes1 = switch (code) {
            case 1 -> "user code";
            case 2 -> "admin code";
            default -> "code is not valid";
        };
        System.out.printf("Result = %s\n", codeRes1);


        code = 15;
        String codeRes2 = switch (code) {
            case 1 -> "user code";
            case 2 -> "admin code";
            default -> {
                String result =  "Code " + code + " is not valid";
                yield result; // результат работы switch для J13
               // break result; // результат работы switch для J12
            }
        };

        System.out.printf("Code Result = %s\n", codeRes2);*/


    }

}
