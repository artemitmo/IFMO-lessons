package lesson15;

import java.nio.ByteBuffer;

public class NIOBuffer {
    public static void main(String[] args) {
        //Канал работет всегда с буфером, канал не блокируется
        //Типы данных буфера, не нужно переводить их
        /*ByteBuffer
        MappedByteBuffer
        CharBuffer
        DoubleBuffer
        FloatBuffer
        IntBuffer
        LongBuffer
        ShortBuffer*/
        //Буфер имеет позицию, емкость, лимит
        //Позиция курсор на нуле, емкость 16, лимит 16, разница 16

        ByteBuffer buffer = ByteBuffer.allocate(16); //создаем объект байт-буфер, указываем его размер
        assert buffer.position() == 0; //метод позишн, начинается с нуля
        assert buffer.capacity() == 16; //метод емкость
        assert buffer.limit() == 16;
        assert buffer.remaining() == 16; // разница между position и limit

        //Асерт - предполагается, что утверждение должно быть верное, если утверждение неверное - то программа выдаст ошибку и остановится на 21 строчке
        //по умолчанию выключен, включить - заходим в эдит конфигурейшн, прописываем -ea

        // Увеличивает позицию на 4.
        buffer.putInt(100); // кладем инт, позиция сдвигается на 4, потому что инт = 4 байтам

        assert buffer.position() == 4;
        assert buffer.remaining() == 12;

        // Увеличивает позицию на 8.
        buffer.putDouble(100.25); //кладем дабл 8 байт

        assert buffer.position() == 12;
        assert buffer.remaining() == 4;

        // Устанавливает лимит на место позиции, сбрасывает позицию в 0.
        buffer.flip(); //приравнивает лимит к позиции, после этого позицию перемещает в ноль

        assert buffer.position() == 0;
        assert buffer.limit() == 12;
        assert buffer.remaining() == 12;

        // Увеличивает позицию на 4.
        int anInt = buffer.getInt();

        assert buffer.position() == 4;
        assert buffer.remaining() == 8;

        // Увеличивает позицию на 8.
        double aDouble = buffer.getDouble();

        assert buffer.position() == 12;
        assert buffer.remaining() == 0;

        // Сбрасывает позицию в 0.
        buffer.rewind(); //лимит не трогает, предполагается для записи. Для чтения - флип.

        assert buffer.position() == 0;
        assert buffer.limit() == 12;
        assert buffer.remaining() == 12;

        // Увеличивает позицию на 4.
        assert anInt == buffer.getInt();
        // Увеличивает позицию на 8.
        assert aDouble == buffer.getDouble();

        // Сбрасывает позицию в 0, ставит лимит, равный емкости буфера
        buffer.clear();

        assert buffer.position() == 0;
        assert buffer.capacity() == 16;
        assert buffer.limit() == 16;
        assert buffer.remaining() == 16;

    }
}
