package lesson14.io.serialization;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        // сериализация - преобразование объектов в последовательность байт
        // десериализация - восстановление объектов из последовательности байт

//        ObjectInputStream
//        ObjectOutputStream

//        File file = new File("stat.bin");
//        LaunchStatistic statistic = null;
//        if (!file.exists()){
//            statistic = new LaunchStatistic();
//        } else {
//            // десериализация (чтение)
//            try (ObjectInputStream objectInput =
//                         new ObjectInputStream(new FileInputStream(file))){
//                statistic = (LaunchStatistic) objectInput.readObject();
//            } catch (IOException | ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//        }
//        if (statistic.isFirstLaunch()){
//            System.out.println("First Launch");
//        } else {
//            System.out.println(statistic);
//        }
//
//        statistic.update();
//
//        // сериализация (запись)
//        try (ObjectOutputStream objectOutput =
//                     new ObjectOutputStream(new FileOutputStream(file))){
//            objectOutput.writeObject(statistic);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        File file = new File("stat2.bin");
        LaunchStatisticExternalizable launch = null;
        if (!file.exists()){
            launch = new LaunchStatisticExternalizable();
        } else  {
            try (ObjectInputStream objectInput =
                         new ObjectInputStream(new FileInputStream(file))){
                launch = (LaunchStatisticExternalizable) objectInput.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        if (launch.isFirstLaunch()){
            System.out.println("First Launch");
        } else {
            System.out.println(launch);
        }

        launch.update();

        try (ObjectOutputStream objectOutput =
                new ObjectOutputStream(new FileOutputStream(file))){
            objectOutput.writeObject(launch);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
