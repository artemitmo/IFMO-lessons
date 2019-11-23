package lesson12.task;

import java.util.*;
public class task1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("qwe", "Tambow");
        map.put("asd", "Tambow");
        map.put("bde", "Tambow");
        map.put("sdr", "Moscow");
        map.put("fgh", "Magadan");
        //String city = "Tambow";
        System.out.println(getPeopleByCity(map, "Magadan"));
    }
    //map хранит login и город проживания
    //Написать метод, который принимает на вход мапу и город
    //формирует список логинов, которые соответствуют переданному городу

    public static List<String> getPeopleByCity (Map<String, String> map, String city){
        List <String> logins = new ArrayList<>(); //перебор мапы
        for (Map.Entry<String, String> entry: map.entrySet()){
            if (entry.getValue().equals(city)){
                logins.add(entry.getKey());
            }
        }
        return logins;
    }


    public static Map<String, Integer> get (Map<String, Integer> map, int from, int to){
        Map<String, Integer> newMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            if (entry.getValue() > from && entry.getValue() < to){
                newMap.put(entry.getKey(), entry.getValue());
            }
        }
        return newMap;
    }
    //дан список строк. Посчитать количество одинаковых слов в списке,
    //Результат в виде
}
