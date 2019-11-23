package lesson14.io;

import java.io.*;
import java.util.Arrays;

public class IOLesson {
    public static void main(String[] args) {
        // io пакет
        // nio пакет

//        InputStream
//        OutputStream

        File file = new File("io.txt");
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        File[] files = file.listFiles();
        System.out.println(file.lastModified());
        try {
//            writeToFile(file, false);
//            readByteArray(file);
//            writeWithBuffer(file);
            writeReadData(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void writeToFile(File file, boolean append) throws IOException {
        try (FileOutputStream fileOutput = new FileOutputStream(file, append)){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                sb.append("Line ").append(i).append("\n");
            }
            byte[] bytes = sb.toString().getBytes();
            fileOutput.write(bytes);
        }
    }

    public static String readByteArray(File file) throws IOException {
        String string = null;

        try (FileInputStream fileInputStream = new FileInputStream(file);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream()
        ){
            System.out.println(fileInputStream.available());

            byte[] buf = new byte[10];
            int data;

            while ((data = fileInputStream.read(buf)) > 0){
                System.out.println(data);
                System.out.println(Arrays.toString(buf));
                outputStream.write(buf, 0, data);
            }
            string = new String(outputStream.toByteArray());
        }

        return string;
    }

    public static void writeWithBuffer(File file) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             BufferedOutputStream outputStream =
                     new BufferedOutputStream(fileOutputStream);
                )
        {
            for (int i = 0; i < 1_000_000; i++) {
                outputStream.write((i + " ").getBytes());
            }

        }

    }

    public static String readFromSeveralFiles(File ...files) throws IOException {
        String string = null;

        try (
                FileInputStream input1 = new FileInputStream(files[0]);
                FileInputStream input2 = new FileInputStream(files[1]);
                ByteArrayOutputStream bout = new ByteArrayOutputStream();
                )
        {
//            InputStream stream1 = new FileInputStream("file1.txt");
//            InputStream stream2 = new FileInputStream("file2.txt");
//            InputStream stream3 = new FileInputStream("file3.txt");
//            InputStream stream4 = new FileInputStream("file4.txt");
//
//            Vector<InputStream> sequence = new Vector<>();
//            sequence.add(stream1);
//            sequence.add(stream2);
//            sequence.add(stream3);
//            sequence.add(stream4);
//            SequenceInputStream sequenceInputStream =
//                    new SequenceInputStream(sequence.elements());

            SequenceInputStream sequenceInputStream =
                    new SequenceInputStream(input1, input2);

            byte[] buf = new byte[10];
            int data;
            while ((data = sequenceInputStream.read(buf)) > 0){
                bout.write(buf, 0, data);
            }

            string = new String(bout.toByteArray());
        }
        return string;
    }


    public static void writeReadData(File file) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
            DataOutputStream dataOutput = new DataOutputStream(fileOutputStream);
        ){
            dataOutput.writeDouble(4.6);
            dataOutput.writeFloat(5.9f);
            dataOutput.writeUTF("hello");
        }

        try (FileInputStream fileInputStream = new FileInputStream(file);
            DataInputStream dataInput = new DataInputStream(fileInputStream);
        ){
            System.out.println(dataInput.readDouble());
            System.out.println(dataInput.readFloat());
            System.out.println(dataInput.readUTF());

//            RandomAccessFile
//            XOR ^

            //
        }
    }









}
