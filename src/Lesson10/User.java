package lesson10;

public class User<T, R> {
//    String id;
//    Integer id;
//    Object id;
    T id;
    R code;

    public static void main(String[] args) {
//        User user = new User();
//        user.id = 90;

        User<String, Integer> user = new User<>();
        user.id = "QWE5";
        user.code = 67;

        User<Integer, String> user2 = new User<>();

        user2.code = "vrghsi567";
        user2.id = 123;

        User<String, String> user3 = new User<>();
    }
}
