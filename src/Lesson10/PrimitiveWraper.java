package Lesson10;

public class PrimitiveWraper {
    public static void main(String[] args) {
        //если есть необходимость использовать только класс - то тогда используем класс-обертку
        //Классы обертки хранят значение соответствующего примитива
        //int -> Integer, short  -> Short, byte -> Byte, long - Long, char -> Character, boolean - Boolean
        //float - Float, double - Double.
        int a = 56;
        Integer integer = a; //создание класса
        int b = integer; //распаковка автоматическая из класса в примитив и обратно

        Double d = 3.78; //создали объект класса Дабл
        Boolean boo = Boolean.FALSE;
        //есть дополнительные методы
        //есть ряд констант
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //методы, преобразующие строки в число ("154446")
        System.out.println(Integer.parseInt("2")); //аналогичный парсинг
        System.out.println(Byte.valueOf("2"));// у парс возвращается примитив, а с велью - объект типа Byte
        Integer integer1 = 3;
        Integer integer2 = 3;
        if (integer1 == integer2) System.out.println("=="); //ограничение при сравнении integer -128 до 127 как примитивов
        //размер кэша с 8й версии можно поменять

        Integer integer3 = 500;
        Integer integer4 = 500;
        if (integer3 == integer4) System.out.println("==");
        //сравниваются хэш, если метод equals не переопределен
        integer1.doubleValue(); // получаем примитив нужного типа
        //посмотреть перечень методов, почитать документацию
        Integer.compare(integer1,integer2);
        Integer.min(integer1,integer2);
        Integer.max(integer1,integer2);
        System.out.println(Integer.sum(integer1,integer2));

    }
}
